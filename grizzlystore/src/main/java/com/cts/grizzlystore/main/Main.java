package com.cts.grizzlystore.main;

import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.service.LoginService;
import com.cts.grizzlystore.service.LoginServiceImpl;
import com.cts.grizzlystore.service.UserService;
import com.cts.grizzlystore.service.UserServiceImpl;

public class Main {

	public static void main(String args[]){
		System.out.println("bsknvbkjl");
		
		UserService userService = UserServiceImpl.getInstance();
		User user = new User("1","Ashwini","123","U",1,"7623023024","Pune","Intern");
		System.out.println(userService.getUser("1"));
		
	}
}
