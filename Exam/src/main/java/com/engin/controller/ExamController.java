package com.engin.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.view.RedirectView;

import com.engin.model.BigErrorExample;
import com.engin.model.BigErrorKey;
import com.engin.model.BigQuestion;
import com.engin.model.BigQuestionExample;
import com.engin.model.College;
import com.engin.model.CollegeExample;
import com.engin.model.CollegeKey;
import com.engin.model.ErrorExample;
import com.engin.model.ErrorKey;
import com.engin.model.HisExam;
import com.engin.model.HisExamExample;
import com.engin.model.Major;
import com.engin.model.MajorExample;
import com.engin.model.MajorKey;
import com.engin.model.Question;
import com.engin.model.QuestionExample;
import com.engin.model.QuestionWithBLOBs;
import com.engin.model.StudentKey;
import com.engin.model.User;
import com.engin.model.UserExample;
import com.engin.model.Year;
import com.engin.model.YearExample;
import com.engin.service.ExamServiceImpl;
import com.engin.service.UserServiceImpl;

@Controller
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	private ExamServiceImpl examService;

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/getErrQueList")
	public String getErrQueList(HttpSession httpSession, Map map) {
		String username = (String) httpSession.getAttribute("registername");
		if (username == null) {
			return "allerror.ftl";
		}

		List<QuestionWithBLOBs> queErrList = new ArrayList<QuestionWithBLOBs>();
		List<String> qusIdList = examService.selectQusIdByUser(username);
		for (String q : qusIdList) {
			System.out.println(q);
			QuestionExample qe = new QuestionExample();
			qe.createCriteria().andIdEqualTo(q);
			List<QuestionWithBLOBs> t = examService
					.selectByExampleWithBLOBs(qe);
			for (QuestionWithBLOBs r : t) {
				queErrList.add(r);
				System.out.println(r.getText() + "  答案：" + r.getAnswer());
				System.out.println("A." + r.getA() + "   B." + r.getB()
						+ "   C." + r.getC() + "   D." + r.getD());
			}
		}
		map.put("QueErrList", queErrList);

		System.out.println("----------");

		List<BigQuestion> bqErrList = new ArrayList<BigQuestion>();
		List<Integer> bqidList = examService.selectBqidByUser(username);
		for (Integer q : bqidList) {
			System.out.println(q);
			BigQuestionExample bqe = new BigQuestionExample();
			bqe.createCriteria().andBqidEqualTo(q);
			List<BigQuestion> t = examService.selectByExampleWithBLOBs(bqe);
			for (BigQuestion r : t) {
				bqErrList.add(r);
				System.out.println(r.getText());
				System.out.println("答案：" + r.getAnswer());
			}

		}
		map.put("BqErrList", bqErrList);

		return "allerror.ftl";
	}

	@RequestMapping("/hisExam")
	public String hisExam(HttpSession httpSession, Map map) {
		String username = (String) httpSession.getAttribute("registername");
		if (username == null) {
			return "hisExam.ftl";
		}
		HisExamExample hee = new HisExamExample();
		hee.createCriteria().andUsernameEqualTo(username);
		List<HisExam> hisExamList = examService.selectByExample(hee);
		for (HisExam q : hisExamList) {
			System.out.println(q.getExamtype() + "===" + q.getSubmitime()
					+ "===" + q.getScore());
		}
		map.put("HisExamList", hisExamList);
		return "hisExam.ftl";
	}

	@RequestMapping("/loginOut")
	public @ResponseBody
	void loginOut(HttpSession httpSession, HttpServletRequest request, Map map) {
		System.out.println("loginOut:"
				+ (String) httpSession.getAttribute("registername") + "---"
				+ (String) httpSession.getAttribute("username"));
		// 获取所有的session
		Enumeration<String> en = request.getSession().getAttributeNames();
		while (en.hasMoreElements()) {// 判断是否还有下一个元素
			// 除移所有session
			request.getSession().removeAttribute(en.nextElement().toString());
		}
		// 最后，还有用map除去。
		map.remove(en);
		System.out.println("loginOut:"
				+ (String) httpSession.getAttribute("registername") + "---"
				+ (String) httpSession.getAttribute("username"));
	}

	@RequestMapping("/userMessage")
	public String userMessage(HttpSession httpSession, Map map) {
		String username = (String) httpSession.getAttribute("registername");

		map.put("year", username.substring(0, 2));

		CollegeExample ce = new CollegeExample();
		ce.createCriteria().andCidEqualTo(username.substring(2, 4))
				.andYearEqualTo(username.substring(0, 2));
		List<College> collegeList = userService.selectByExample(ce);
		System.out.println(collegeList.get(0).getName());
		map.put("college", collegeList.get(0).getName());

		MajorExample me = new MajorExample();
		me.createCriteria().andMidEqualTo(username.substring(4, 6))
				.andCidEqualTo(username.substring(2, 4))
				.andYearEqualTo(username.substring(0, 2));
		List<Major> majorList = userService.selectByExample(me);
		System.out.println(majorList.get(0).getName());
		map.put("major", majorList.get(0).getName());

		map.put("class", username.substring(6, 8));

		map.put("student", username.substring(8, 10));

		return "usermessage.ftl";
	}

	@RequestMapping("/toUserModify")
	public String toUserModify() {
		return "usermodify.ftl";
	}

	@RequestMapping("/userModify")
	public @ResponseBody
	String userModify(HttpServletRequest request, HttpSession httpSession) {
		String password = request.getParameter("password");
		System.out.println("password:" + password);
		String uname = (String) httpSession.getAttribute("registername");
		String username = uname;
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		UserExample ue = new UserExample();
		ue.createCriteria().andUsernameEqualTo(uname);
		if (userService.updateByExampleSelective(u, ue) > 0) {
			return "1";
		}
		return "0";
	}
}
