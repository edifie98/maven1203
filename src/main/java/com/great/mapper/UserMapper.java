package com.great.mapper;

import com.great.javabean.TB_MENU;
import com.great.javabean.TB_USER;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;




public interface UserMapper
{

	public List<TB_MENU> findMenuByUSID();
	public TB_USER findByUSID(@Param("USID")String uid, @Param("UPASS")String uPass);
	public List<TB_USER> findUserManager(@Param("startNum")int startNum,@Param("lastNum")int lastNum,@Param("userName")String userName,@Param("startDate")String startDate ,@Param("endDate")String endDate);
	public int count();
	public int addUser(TB_USER user);
	public int deleteById(TB_USER user);
	public int updateUser(TB_USER user);

}