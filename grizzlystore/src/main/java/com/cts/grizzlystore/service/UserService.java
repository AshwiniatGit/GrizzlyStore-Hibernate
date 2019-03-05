package com.cts.grizzlystore.service;

import java.util.List;

import com.cts.grizzlystore.bean.User;

public interface UserService {
	public String addUser(User user);
	public String updateUser(String id, User user);
	public String deleteUser(String id);
	public User getUser(String id);
	public List<User> getUsersByNames(String name);
	public List<User> getUsers();
 }

