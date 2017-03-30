package com.engin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engin.dao.ClassMapper;
import com.engin.dao.CollegeMapper;
import com.engin.dao.MajorMapper;
import com.engin.dao.StudentMapper;
import com.engin.dao.UserMapper;
import com.engin.dao.YearMapper;
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


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userDao;

	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userDao.selectByExample(example);
	}
	
	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userDao.insert(record);
	}
	
	@Autowired
	private YearMapper yearDao;
	
	@Override
	public List<Year> selectByExample(YearExample example) {
		// TODO Auto-generated method stub
		return yearDao.selectByExample(example);
	}

	@Autowired
	private CollegeMapper collegeDao;
	
	@Override
	public List<College> selectCidAndName() {
		// TODO Auto-generated method stub
		return collegeDao.selectCidAndName();
	}

	@Autowired
	private MajorMapper majorDao;
	
	@Override
	public List<Major> selectMidAndNameByCid(String cid) {
		// TODO Auto-generated method stub
		return majorDao.selectMidAndNameByCid(cid);
	}
	
	@Override
	public List<Major> selectMidAndName() {
		// TODO Auto-generated method stub
		return majorDao.selectMidAndName();
	}

	@Override
	public List<Major> selectByExample(MajorExample example) {
		// TODO Auto-generated method stub
		return majorDao.selectByExample(example);
	}
	
	@Autowired
	private ClassMapper classDao;
	
	@Override
	public List<ClassKey> selectClassid() {
		// TODO Auto-generated method stub
		return classDao.selectClassid();
	}

	@Autowired
	private StudentMapper studentDao;
	
	@Override
	public int insert(Student record) {
		// TODO Auto-generated method stub
		return studentDao.insert(record);
	}

	@Override
	public Student selectByPrimaryKey(StudentKey key) {
		// TODO Auto-generated method stub
		return studentDao.selectByPrimaryKey(key);
	}
}
