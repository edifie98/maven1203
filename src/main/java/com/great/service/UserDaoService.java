package com.great.service;


import com.great.javabean.TB_USER;
import com.great.mapper.UserMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserDaoService
{

	@Resource
	private UserMapper userMapper;

	public TB_USER findByUSID(String login_id,String login_pass)
	{
		TB_USER user=userMapper.findByUSID(login_id,login_pass);
		return user;
	}

	public List<TB_USER> findUserManager(int startNum,int lastNum,String userName,String startDate ,String endDate)
	{
		List<TB_USER> users = userMapper.findUserManager(startNum,lastNum,userName, startDate , endDate);
		return users;
	}

	public int count()
	{
		int con=userMapper.count();
		return con;
	}

	public void addUser(TB_USER user)
	{
		userMapper.addUser(user);
		System.out.println("执行添加");
	}

	public int deleteById(TB_USER user)
	{
		userMapper.deleteById(user);
		System.out.println("delsucc");
		return 1;
	}


	public int updateUser(TB_USER user)
	{
		userMapper.updateUser(user);
		System.out.println("update");
		return 1;
	}



}
