package com.caizhixiang.springboot.web.controller.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public User index() {
		User user = new User();
		user.setId(1);
		user.setName("11");
		return user;
	}
}

@Data
class User {
	Integer id;
	String name;
}