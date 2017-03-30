package com.engin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.engin.model.ClassExample;
import com.engin.model.ClassKey;
import com.engin.model.College;
import com.engin.model.CollegeExample;
import com.engin.model.Major;
import com.engin.model.MajorExample;
import com.engin.model.Student;
import com.engin.model.StudentExample;
import com.engin.model.StudentKey;
import com.engin.model.User;
import com.engin.model.UserExample;
import com.engin.model.Year;
import com.engin.model.YearExample;
import com.engin.service.UserServiceImpl;

@Controller
@RequestMapping(value={"/user"})
@SessionAttributes({"username"})
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value="/index")
	public String loginm(){// 请求登录
		System.out.println("请求登录");
		return "login.ftl";
	}
	
	@RequestMapping(value="/youke")
	public String youke(){// 游客进入
		System.out.println("游客进入");
		return "main.ftl";
	}
	
	@RequestMapping(value="/login")
	public String login(RedirectAttributes att, User user, Map map){// 登录
//		System.out.println(userService);
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
		if(userService.selectByExample(ue).size() > 0){
			String username = user.getUsername();
			StudentKey sk = new StudentKey();
			sk.setYear(username.substring(0, 2));
			sk.setCid(username.substring(2, 4));
			sk.setMid(username.substring(4, 6));
			sk.setClassid(username.substring(6, 8));
			sk.setSid(username.substring(8, 10));
			Student student = userService.selectByPrimaryKey(sk);
			map.put("username", student.getName());
			return "main.ftl";
		}
		map.put("loginfail", "登录失败，请重新登录！");
		return "login.ftl";
	}
	
	@RequestMapping(value="/registerm")
	public String registerm(Map map){
		System.out.println("请求注册");
		YearExample ye = new YearExample();
		List<Year> yearList = userService.selectByExample(ye);
		map.put("yearList", yearList);
		
		List<College> collegeList = userService.selectCidAndName();
		map.put("collegeList", collegeList);
		
//		MajorExample me = new MajorExample();
//		List<Major> majorList = userService.selectMidAndName();
//		map.put("majorList", majorList);
		
		List<ClassKey> classList = userService.selectClassid();
		map.put("classList", classList);
		
		return "register.ftl";
	}
	
	@RequestMapping(value="/getMByC")
	public @ResponseBody List<Major> getMajorByCollege(HttpServletRequest request, HttpServletResponse response){
		String cid = request.getParameter("cid");
		String msg = "";     
		System.out.println(cid);
		List<Major> majorList = userService.selectMidAndNameByCid(cid);
		for(Major q : majorList){
			System.out.println(q.getName());
		}
		return majorList;
	}
	
	@RequestMapping(value="/register")
	public String register(Year year, College college, Major major, ClassKey classkey, Student student, 
			User user, Map map){// 注册
		String sid = student.getSid();
		if(Integer.parseInt(sid) < 10){
			sid = "0"+student.getSid();
		}
		System.out.println(year.getYear()+" "+college.getCid()+
				" "+major.getMid()+" "+classkey.getClassid()+
				" "+sid+" "+student.getName()+" "+user.getPassword());
		try {
			Student stu = new Student();
			stu.setSid(sid);
			stu.setYear(year.getYear());
			stu.setCid(college.getCid());
			stu.setMid(major.getMid());
			stu.setClassid(classkey.getClassid());
			stu.setName(student.getName());
			int i = userService.insert(stu);
			
			User u = new User();
			String username = year.getYear()+college.getCid()+major.getMid()+classkey.getClassid()+sid;
			u.setUsername(username);
			u.setPassword(user.getPassword());
			int j = userService.insert(u);
			
			if(i > 0 && j > 0){
				map.put("registermsg", "注册成功！你的用户名是："+ username);
				return "login.ftl";
			}
		} catch (Exception e) {
			// TODO: handle exception
			map.put("registermsg", "注册失败！");
			return "registerfail.ftl";
		}
		map.put("registermsg", "注册失败！");
		return "registerfail.ftl";
	}
}
