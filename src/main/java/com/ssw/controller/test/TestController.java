package com.ssw.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssw.entity.admin.User;
import com.ssw.service.admin.UserService;

@RestController
public class TestController {

	@Autowired
	private UserService userService;

	@RequestMapping("/test")
	public String test() {
		return "success";
	}

	@RequestMapping("/testSql")
	public List<User> testSql() {
		return userService.findAll();
	}

}
