package com.great.controller;

import com.great.annotation.MyController;
import com.great.annotation.MyRequestMapping;
import com.great.javabean.TB_MENU;
import com.great.javabean.TB_USER;
import com.great.javabean.TableDate;
import com.great.service.MenuDaoService;
import com.great.service.UserDaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class TestController
{

	//注入set生成成员变量
	@Resource
	private UserDaoService userDaoService;
	@Resource
	private MenuDaoService menuDaoService;

	@RequestMapping("/login.action")
	public ModelAndView test1(HttpServletResponse response, HttpServletRequest request,String uid,String uPass)
	{
		TB_USER user=userDaoService.findByUSID(uid,uPass);
		ModelAndView modelAndView=new ModelAndView();


		if (user != null ){
			Map<String, List<TB_MENU>> menuMap = menuDaoService.findMenuByUSID();
			System.out.println(user.toString());
			System.out.println(menuMap.toString());
			modelAndView.addObject("user",user);
			modelAndView.addObject("menu",menuMap);
			modelAndView.setViewName("AdminMain");
		}else {
			modelAndView.addObject("fail","账号或密码错误");
			modelAndView.setViewName("LoginMain");
		}
		return modelAndView;

	}

	@RequestMapping("/UserQuery.action")
	public ModelAndView userQuery(HttpServletResponse response, HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("UserQuery");

		return modelAndView;
	}


	@RequestMapping("/UserSearch.action")
	public ModelAndView userSearch(HttpServletResponse response, HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("UserSearch");

		return modelAndView;
	}


	@ResponseBody
@RequestMapping("/tableQuery.action")
public TableDate TableQuery(HttpServletResponse response, HttpServletRequest request, int page, int limit,String userName,String startDate,String endDate){
	//limit条件
	System.out.println(userName);
	int startNum=1*(page-1)*limit+1;
	int lastNum=page*limit;
	int count = userDaoService.count();
	List<TB_USER> users=userDaoService.findUserManager(startNum,lastNum,userName, startDate , endDate);
	TableDate tableDate=new TableDate();
	tableDate.setCode(0);
	tableDate.setMsg("");
	tableDate.setCount(count+"");
	tableDate.setData(users);

	System.out.println(tableDate.toString());
	return tableDate;
}
	@ResponseBody
	@RequestMapping("/addQuery.action")
	public String TableQuery(HttpServletResponse response, HttpServletRequest request,TB_USER user){
		System.out.println(user.toString());
		userDaoService.addUser(user);
		return "succ";
	}


	@ResponseBody
	@RequestMapping("/delQuery.action")
	public String DelQuery(HttpServletResponse response, HttpServletRequest request,TB_USER user){
		System.out.println(user);
		userDaoService.deleteById(user);
		return "succ";
	}

	@ResponseBody
	@RequestMapping("/updateQuery.action")
	public String updateQuery(HttpServletResponse response, HttpServletRequest request,TB_USER user){
		System.out.println(user);
		userDaoService.updateUser(user);
		return "succupdate";
	}







}
