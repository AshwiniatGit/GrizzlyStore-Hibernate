package com.cts.grizzlystore.service;

public interface LoginService {
	
	public int getUserStatus(String id);
	public String getUserType(String id);
	public boolean authenticate(String userName, String password);
	public String authorization(String userName);
	public void resetStatus(String id);
	public void inceraseAttempt(String id, int val);
	public boolean checkUser(String id);
}
