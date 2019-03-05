package com.cts.grizzlystore.service;

import java.util.List;


import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.dao.UserDAO;
import com.cts.grizzlystore.dao.UserDAOImpl;

public class UserServiceImpl implements UserService {

	private static UserServiceImpl UserServiceImpl;
	
	private  UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static UserServiceImpl getInstance(){
		if(UserServiceImpl==null)
		{
			UserServiceImpl = new UserServiceImpl();
		}
		return UserServiceImpl;
	}
	UserDAO dao =  UserDAOImpl.getInstance();
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public String updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return dao.getUser(id);
	}

	@Override
	public List<User> getUsersByNames(String name) {
		// TODO Auto-generated method stub
		return dao.getUsersByNames(name);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return dao.getUsers();
	}

}
