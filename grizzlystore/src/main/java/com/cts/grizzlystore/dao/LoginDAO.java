package com.cts.grizzlystore.dao;

public interface LoginDAO {
	
	public int getUserStatus(String id);
	public String getUserType(String id);
	public boolean authenticate(String userName, String password);
	public boolean checkUser(String id);
	public void resetStatus(String id);
	public void inceraseAttempt(String id, int val);
}
