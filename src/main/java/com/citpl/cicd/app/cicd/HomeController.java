package com.citpl.cicd.app.cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	public String get () {
		return "home:"+System.currentTimeMillis();
	}
}

