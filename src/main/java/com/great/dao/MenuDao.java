package com.great.dao;

import com.great.db.MybatisUtils;
import com.great.javabean.TB_MENU;
import com.great.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDao
{
	public List<TB_MENU> Table(int id)
		{
			SqlSession sqlSession = MybatisUtils.getSession();
//			List<TB_MENU> list = sqlSession.getMapper(UserMapper.class).findMenuByUSID(id);
			sqlSession.commit();
			sqlSession.close();
//			return list;
			return null;
		}

}
