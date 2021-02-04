package com.mvcDemo;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class myClass {

	@Autowired
	Calculator cal;
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public ModelAndView hello(Integer num1, Integer num2)
	{
		System.out.println("Welcome to Spring MVC Calculator");
		System.out.println(num1);
		System.out.println(num2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		int result=cal.addition(num1, num2);
		mv.addObject("message", "Answer ="+result);
		return mv;
	}
	
	@RequestMapping(value="/hi", method=RequestMethod.POST)
	public ModelAndView bye(@RequestParam("num1")int no1, @RequestParam("num2")int no2, String type)
	{
		System.out.println("Welcome to Spring MVC Calculator");
		System.out.println(no1);
		System.out.println(no2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		if(type.equals("+"))
		{
			int result=cal.addition(no1, no2);
			mv.addObject("message", "Answer ="+result);
		}
		else if(type.equals("+"))
		mv.addObject("message", "Answer="+cal.substraction(no1, no2));
		else if(type.equals("*"))
		mv.addObject("message", "Answer="+cal.multiplication(no1, no2));
		else if(type.equals("/"))
		mv.addObject("message", "Answer="+cal.devide(no1, no2));

		return mv;
		
		
	}
	
	
	

	
	
}
