package com.engin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.engin.model.BigErrorExample;
import com.engin.model.BigErrorKey;
import com.engin.model.BigQuestion;
import com.engin.model.BigQuestionExample;
import com.engin.model.ErrorExample;
import com.engin.model.ErrorKey;
import com.engin.model.HisExam;
import com.engin.model.HisExamExample;
import com.engin.model.Question;
import com.engin.model.QuestionExample;
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
		
		List<QuestionWithBLOBs> queErrList = new ArrayList<QuestionWithBLOBs>();
		List<String> qusIdList = examService.selectQusIdByUser(username);
		for(String q : qusIdList){
			System.out.println(q);
			QuestionExample qe = new QuestionExample();
			qe.createCriteria().andIdEqualTo(q);
			List<QuestionWithBLOBs> t = examService.selectByExampleWithBLOBs(qe);
			for(QuestionWithBLOBs r : t){
				queErrList.add(r);
				System.out.println(r.getText()+"  答案："+r.getAnswer());
				System.out.println("A."+r.getA()+"   B."+r.getB()+"   C."+r.getC()+"   D."+r.getD());
			}
		}
		map.put("QueErrList", queErrList);
		
		System.out.println("----------");
		
		List<BigQuestion> bqErrList = new ArrayList<BigQuestion>();
		List<Integer> bqidList = examService.selectBqidByUser(username);
		for(Integer q : bqidList){
			System.out.println(q);
			BigQuestionExample bqe = new BigQuestionExample();
			bqe.createCriteria().andBqidEqualTo(q);
			List<BigQuestion> t = examService.selectByExampleWithBLOBs(bqe);
			for(BigQuestion r : t){
				bqErrList.add(r);
				System.out.println(r.getText());
				System.out.println("答案："+r.getAnswer());
			}
			
		}
		map.put("BqErrList", bqErrList);
		
		return "allerror.ftl";
	}
	
	@RequestMapping("/hisExam")
	public String hisExam(HttpSession httpSession, Map map){
		String username = (String)httpSession.getAttribute("registername");
		HisExamExample hee = new HisExamExample();
		hee.createCriteria().andUsernameEqualTo(username);
		List<HisExam> hisExamList = examService.selectByExample(hee);
		for(HisExam q : hisExamList){
			System.out.println(q.getExamtype()+"==="+q.getSubmitime()+"==="+q.getScore());
		}
		map.put("HisExamList", hisExamList);
		return "hisExam.ftl";
	}
}
