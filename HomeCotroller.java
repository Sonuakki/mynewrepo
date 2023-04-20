package com.amtrp.springBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeCotroller {
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}

}
