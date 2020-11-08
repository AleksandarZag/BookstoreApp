package com.bookstore.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@EnableAutoConfiguration
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
