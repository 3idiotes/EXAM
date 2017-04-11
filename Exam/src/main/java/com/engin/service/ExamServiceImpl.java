package com.engin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engin.dao.ErrorMapper;
import com.engin.dao.UserMapper;
import com.engin.model.ErrorExample;
import com.engin.model.ErrorKey;
import com.engin.model.Question;
import com.engin.model.QuestionExample;

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
	public List<Question> selectByExample(QuestionExample example) {
		// TODO Auto-generated method stub
		return null;
	}

}
