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
		LoginService loginService = LoginServiceImpl.getInstance();
		User user = new User("1","Ashwini","123","U",1,"7623023024","Pune","Intern");
		loginService.resetStatus("1");
		System.out.println(loginService.getUserStatus("1")+"staus");
		loginService.inceraseAttempt("1", loginService.getUserStatus("1"));
		System.out.println(loginService.getUserStatus("1")+"staus");
		
	}
}
