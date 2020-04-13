package com.iu.spring_2.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@RequestMapping(value = "memberJoin")
	public void memberJoin() {
		
	}
	@RequestMapping(value = "memberJoin",method = RequestMethod.POST)
	public void memberJoin2() {
		System.out.println("조인 post");
		
	}
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() {
	}
	
	@RequestMapping(value = "memberLogin",method = RequestMethod.POST)
	public String memberLogin2() {
		System.out.println("로그인 post");
		
		return "redirect:../";//리다이렉트 하겠다. ../ 
	}
	
	@RequestMapping(value = "memberPage")
	public String memberPage() {
		return "member/memberPage";
	}
	
	@RequestMapping(value = "memberPage",method = RequestMethod.POST)
	public String memberPage2() {
		System.out.println("페이지 post");
		return "member/memberPage";
	}
	
	
	@RequestMapping(value = "memberUpdate")
	public String memberUpdate() {
		return "member/memberUpdate";
		
	}
	
	@RequestMapping(value = "memberUpdate",method = RequestMethod.POST)
	public String memberUpdate2() {
		System.out.println("업뎃 post");
		return "member/memberUpdate";
		
	}
	@RequestMapping(value = "memberDelete")
	public void memberDelete() {
		System.out.println("memberdelete");
	}
	
	
	
}
