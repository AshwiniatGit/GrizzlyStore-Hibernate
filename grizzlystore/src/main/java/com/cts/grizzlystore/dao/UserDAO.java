package com.cts.grizzlystore.dao;

import java.util.List;

import com.cts.grizzlystore.bean.User;

public interface UserDAO {
	public String addUser(User user);
	public String updateUser(String id, User user);
	public String deleteUser(String id);
	public User getUser(String id);
	public List<User> getUsersByNames(String name);
	public List<User> getUsers();
 }

