package com.citpl.cicd.app.cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {

	public String get () {
		log.debug("/home");
		return "home:"+System.currentTimeMillis();
	}
}

