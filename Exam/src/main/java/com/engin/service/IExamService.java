package com.engin.service;

import java.util.List;

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

public interface IExamService {
	List<ErrorKey> selectByExample(ErrorExample example);
	List<BigErrorKey> selectByExample(BigErrorExample example);
	List<Question> selectByExample(QuestionExample example);
	List<String> selectQusIdByUser(String username);
	List<Integer> selectBqidByUser(String username); 
	List<QuestionWithBLOBs> selectByExampleWithBLOBs(QuestionExample example);
	List<BigQuestion> selectByExampleWithBLOBs(BigQuestionExample example);
	List<HisExam> selectByExample(HisExamExample example);
}
