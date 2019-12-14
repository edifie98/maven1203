package com.great.dao;

import com.great.db.MybatisUtils;
import com.great.javabean.TB_MENU;
import com.great.javabean.TB_USER;
import com.great.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao
{
	public TB_USER UserLogin(String  id,String pass)
		{
			SqlSession sqlSession = MybatisUtils.getSession();
			TB_USER user = sqlSession.getMapper(UserMapper.class).findByUSID(id,pass);
			sqlSession.commit();
			sqlSession.close();
			return user;

		}

}
