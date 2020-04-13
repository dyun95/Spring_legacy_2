package com.iu.spring_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//밑에 리턴값은 jsp 이름
		return "index";
	}
	
	//if (command.equals) 를 단순화 시켯다 밑에처럼	 method= 안쓰면  기본값  GET
	@RequestMapping(value = "/test")
	public String test() {
		System.out.println("Test 실행.");
		return "test";
	}
	
	
	@RequestMapping(value = "/test2", method =RequestMethod.GET)
	public String test2() {
		System.out.println("TEST2 실행");
		return "test2";
		
	}
	@RequestMapping(value = "/test3",method = RequestMethod.GET)
	public String test3() {
		System.out.println("test3실행");
		return "sub/test3";
		
	}
	
	
}
