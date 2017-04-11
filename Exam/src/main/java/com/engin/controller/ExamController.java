package com.engin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.engin.model.ErrorExample;
import com.engin.model.ErrorKey;
import com.engin.model.Question;
import com.engin.model.QuestionWithBLOBs;
import com.engin.service.ExamServiceImpl;

@Controller
@RequestMapping("/exam")
public class ExamController {
	
	@Autowired
	private ExamServiceImpl examService;
	
	@RequestMapping("/getErrQueList")
	public String getErrQueList(HttpSession httpSession, Map map){
		String username = (String) httpSession.getAttribute("registername");
		ErrorExample ee = new ErrorExample();
		ee.createCriteria().andUsernameEqualTo(username);
		List<ErrorKey> errList = examService.selectByExample(ee);
		List<String> queIdList = new ArrayList<String>();
		for(ErrorKey q : errList){
			System.out.println(q.getUsername()+"==="+q.getId());
			queIdList.add(q.getId());
		}
		return "main.ftl";
	}
	
	@RequestMapping("/getQueList")
	public String getQueList(Map map){
		return "";
	}
	
	@RequestMapping("/getErrList")
	public String getErrList(Map map){
		return "";
	}
	
	@RequestMapping("/getScore")
	public String getScore(Map map){
		return "";
	}
}
