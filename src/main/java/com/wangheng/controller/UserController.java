package com.wangheng.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wangheng.bean.User;

@RestController
@RequestMapping(value="/user")
public class UserController {

	//创建线程安全的map ，用来存放操作数据
	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<User> getUserList(){
		List<User> list = new ArrayList<User>(users.values());
		return list;
	}

	@RequestMapping(value = "/" , method = RequestMethod.POST)
	public String postUser(@ModelAttribute User user) {
		users.put(user.getId(), user);
		return "success";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public User getUser(@PathVariable Long id) {
		return users.get(id);
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable Long id) {
		users.remove(id);
		return "success";
	}
	
}
