package com.jt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {
	@RequestMapping("doIndexUI")
	public String doIndexUI(){
		return "starter";//starter.html
	}
	//返回分頁頁面的部分
	@RequestMapping("doPageUI")
	public String doPageUI(){
		return "common/page";
	}
}




