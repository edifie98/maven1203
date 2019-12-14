package com.great.service;

import com.great.Spring;
import com.great.dao.MenuDao;
import com.great.javabean.TB_MENU;
import com.great.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuDaoService
{
	@Resource
	private UserMapper userMapper;



	public Map<String,List<TB_MENU>> findMenuByUSID(){

		List<TB_MENU> menuList = userMapper.findMenuByUSID();

		Map<String,List<TB_MENU>> map = new HashMap<>();

		for (TB_MENU menu : menuList)
		{
			if (map.containsKey(menu.getPARENTNAME()))
			{
				List<TB_MENU> valueList =map.get(menu.getPARENTNAME());
				valueList.add(menu);
			} else
			{
				List<TB_MENU> valueList = new ArrayList<>();
				valueList.add(menu);
				map.put(menu.getPARENTNAME(), valueList);
			}
			
		}
		return map;
	}

}


