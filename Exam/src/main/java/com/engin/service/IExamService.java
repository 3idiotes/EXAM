package com.engin.service;

import java.util.List;

import com.engin.model.ErrorExample;
import com.engin.model.ErrorKey;
import com.engin.model.Question;
import com.engin.model.QuestionExample;

public interface IExamService {
	List<ErrorKey> selectByExample(ErrorExample example);
	List<Question> selectByExample(QuestionExample example);
}
