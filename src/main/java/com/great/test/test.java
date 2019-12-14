package com.great.test;

import com.great.db.MybatisUtils;
import com.great.javabean.TB_MENU;
import com.great.mapper.UserMapper;
import com.great.service.MenuDaoService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test
{

	public static void main(String[] args)
	{

		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MenuDaoService example = (MenuDaoService) context.getBean("MenuDaoService");
//		System.out.println(example.getMenuDao().findMenuByUSID(4));
		context.close();
	}



}
