package com.lili.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpring {
	
	@RequestMapping("toTestPage")
	public String toHelloSpringPage() {
		return "test";
	}

	@RequestMapping("testStr")
	@ResponseBody
	public String testStr() {
		return "test";
	}
}
