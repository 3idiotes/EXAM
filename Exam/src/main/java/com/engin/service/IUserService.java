package com.engin.service;

import java.util.List;

import com.engin.model.ClassKey;
import com.engin.model.College;
import com.engin.model.Major;
import com.engin.model.MajorExample;
import com.engin.model.Student;
import com.engin.model.StudentExample;
import com.engin.model.StudentKey;
import com.engin.model.User;
import com.engin.model.UserExample;
import com.engin.model.Year;
import com.engin.model.YearExample;

public interface IUserService {
	List<User> selectByExample(UserExample example);
	List<Year> selectByExample(YearExample example);
	List<Major> selectByExample(MajorExample example);
	List<College> selectCidAndName();
	List<Major> selectMidAndName();
	List<ClassKey> selectClassid();
	List<Major> selectMidAndNameByCid(String cid);
	int insert(Student record);
	int insert(User record);
	Student selectByPrimaryKey(StudentKey key);
}
