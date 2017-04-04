package com.engin.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

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
@SessionAttributes({"username", "registername"})
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value="/loginm")
	public String loginm(HttpServletRequest request, HttpServletResponse response, Map map){// 请求登录
		System.out.println("请求登录");

//		String loginmsg = request.getParameter("loginmsg");
//		if(loginmsg != null){
//			switch (loginmsg) {
//			case "null":
//				map.put("loginmsg", "用户名或密码为空！");
//				break;
//			case "fail":
//				map.put("loginmsg", "登录失败，请重新登录！");
//				break;
//			default:
//				break;
//			}
//		}

		String loginmsg = request.getParameter("loginmsg");
		if(loginmsg != null){
			switch (loginmsg) {
			case "error":
				map.put("loginmsg", "用户名或密码为空！");
				break;
			case "fail":
				map.put("loginmsg", "登录失败，请重新登录！");
				break;
			default:
				break;
			}
		}

		String username = request.getParameter("username");
		if(username != null){
//			map.put("registermsg", "注册成功!你的用户名是："+username);
			//try {
				String flag=request.getParameter("flag");
				map.put("flag", flag);
				map.put("registername", username);
				response.setContentType("text/html;charset=UTF-8");
//				PrintWriter out = response.getWriter();
//			    
//			    out.println("<script language='javascript'>");
//			    out.println("alert('你的用户名是:'"+username+");");
//			    //out.println("history.back();");
//			    out.println("</script>");
//			    out.flush();
//				//out.print("<script language='javascript'>alert('your userid is :"+username+"');</script>");
			//} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
			return "login.ftl";
		}
		return "login.ftl";
	}
	
	@RequestMapping(value="/youke")
	public String youke(){// 游客进入
//		System.out.println("游客进入");
		return "main.ftl";
	}
	
	@RequestMapping(value="/login")
	public @ResponseBody Student login(Map map, RedirectAttributes attr, HttpServletRequest request){// 登录
//		System.out.println(userService);

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"---"+password);
		Student student = null;

//		System.out.println(user.getUsername()+"---"+user.getPassword());
//		if(user.getUsername() == "" || user.getPassword() == ""){
//			return new RedirectView("/user/loginm?loginmsg=error",true,false,false);
//		}

		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		if(userService.selectByExample(ue).size() > 0){
			StudentKey sk = new StudentKey();
			sk.setYear(username.substring(0, 2));
			sk.setCid(username.substring(2, 4));
			sk.setMid(username.substring(4, 6));
			sk.setClassid(username.substring(6, 8));
			sk.setSid(username.substring(8, 10));
			student = userService.selectByPrimaryKey(sk);
//			map.put("username", student.getName());
			attr.addFlashAttribute("username", student.getName());
			return student;
		}
//		map.put("loginfail", "登录失败，请重新登录！");
		return student;
	}
	
	@RequestMapping("/main")
	public String main(HttpServletRequest request, Map map){
		String username = request.getParameter("username");
		if(username != null && !username.equals("")){
			System.out.println(username);
			map.put("username", username);
		}
		return "main.ftl";
	}
	
	@RequestMapping(value="/registerm")
	public String registerm(Map map, HttpServletRequest request){
		System.out.println("请求注册");
		
		String registermsg = request.getParameter("registermsg");
		if(registermsg != null){
			System.out.println(registermsg);
			switch (registermsg) {
			case "inperfect":
				map.put("registermsg", "输入信息不完整");
				break;
			case "inconformity":
				map.put("registermsg", "两次密码输入不一致");
				break;
			case "exist":
				map.put("registermsg", "注册失败，该同学已经注册过了");
				break;
			case "fail":
				map.put("registermsg", "注册失败");
				break;
			default:
				break;
			}
		}
		
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
	
//	@RequestMapping(value="/loginMsg")
//	public @ResponseBody String loginMsg(HttpServletRequest request, HttpServletResponse response){
//		String loginMsg = request.getParameter("loginmsg");
//		if(loginMsg != null){
//			System.out.println(loginMsg);
//			return "登录失败！";
//		}
//		return "";
//	}
	
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
	public RedirectView register(Year year, College college, Major major, ClassKey classkey, Student student, 
			 User user, Map map){// 注册
		if((year == null) || (college == null) || (major == null) || (classkey == null) || (student == null) ||
				(student == null || student.getName().equals("")) ||
				(user == null || user.getPassword().equals(""))){
//			map.put("registermsg", "输入信息不完整");
			return new RedirectView("/user/registerm?registermsg=inperfect",true,false,false);
		}
		if(!user.getPassword().equals(user.getRepassword())){
//			map.put("registermsg", "两次密码输入不一致");
			return new RedirectView("/user/registerm?registermsg=inconformity",true,false,false);
		}
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
				return new RedirectView("/user/loginm?username="+username+"&flag=1",true,false,false);
			}
		} catch (Exception e) {
			// TODO: handle exception
//			map.put("registermsg", "注册失败！该同学已经注册");
			return new RedirectView("/user/registerm?registermsg=exist",true,false,false);
		}
//		map.put("registermsg", "注册失败！");
		return new RedirectView("/user/registerm?registermsg=fail",true,false,false);
	}
}
