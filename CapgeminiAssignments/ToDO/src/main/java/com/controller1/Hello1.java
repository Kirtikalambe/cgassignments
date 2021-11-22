package com.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello1 {

	@RequestMapping(value ="/login1", method = RequestMethod.GET)
	public String showLoginPage() {
		return "index";
	}
}
