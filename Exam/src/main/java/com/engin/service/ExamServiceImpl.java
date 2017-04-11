package com.engin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engin.dao.BigErrorMapper;
import com.engin.dao.BigQuestionMapper;
import com.engin.dao.ErrorMapper;
import com.engin.dao.HisExamMapper;
import com.engin.dao.QuestionMapper;
import com.engin.dao.UserMapper;
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

@Service
public class ExamServiceImpl implements IExamService {
	
	@Autowired
	private ErrorMapper errorDao;

	@Override
	public List<ErrorKey> selectByExample(ErrorExample example) {
		// TODO Auto-generated method stub
		return errorDao.selectByExample(example);
	}
	
	@Override
	public List<String> selectQusIdByUser(String username) {
		// TODO Auto-generated method stub
		return errorDao.selectQusIdByUser(username);
	}

	@Override
	public List<Question> selectByExample(QuestionExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	private BigErrorMapper bigErrorDao;
	
	@Override
	public List<BigErrorKey> selectByExample(BigErrorExample example) {
		// TODO Auto-generated method stub
		return bigErrorDao.selectByExample(example);
	}

	@Override
	public List<Integer> selectBqidByUser(String username) {
		// TODO Auto-generated method stub
		return bigErrorDao.selectBqidByUser(username);
	}
	
	@Autowired
	private QuestionMapper quesDao;

	@Override
	public List<QuestionWithBLOBs> selectByExampleWithBLOBs(
			QuestionExample example) {
		// TODO Auto-generated method stub
		return quesDao.selectByExampleWithBLOBs(example);
	}

	@Autowired
	private BigQuestionMapper bigQuesDao;
	
	@Override
	public List<BigQuestion> selectByExampleWithBLOBs(BigQuestionExample example) {
		// TODO Auto-generated method stub
		return bigQuesDao.selectByExampleWithBLOBs(example);
	}

	@Autowired
	private HisExamMapper hisExamDao;
	
	@Override
	public List<HisExam> selectByExample(HisExamExample example) {
		// TODO Auto-generated method stub
		return hisExamDao.selectByExample(example);
	}

}
