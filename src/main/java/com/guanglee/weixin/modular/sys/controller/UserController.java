package com.guanglee.weixin.modular.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.guanglee.weixin.modular.sys.model.User;
import com.guanglee.weixin.modular.sys.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/sys/user/findbyid/{id}")
	public User findById(@PathVariable String id) {
		return service.findById(id);
	}

	@GetMapping("/sys/user/deletebyid/{id}")
	public String deleteById(@PathVariable String id) {
		service.deleteById(id);
		return "SUCCESS";
	}
}