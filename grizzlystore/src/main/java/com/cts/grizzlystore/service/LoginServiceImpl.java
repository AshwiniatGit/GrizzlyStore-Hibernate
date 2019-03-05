package com.cts.grizzlystore.service;

import com.cts.grizzlystore.dao.LoginDAO;
import com.cts.grizzlystore.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {

	private static LoginServiceImpl LoginServiceImpl;
	private LoginDAO dao = LoginDAOImpl.getInstance();
	
	private LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static LoginServiceImpl getInstance(){
		if(LoginServiceImpl == null)
			LoginServiceImpl = new LoginServiceImpl();
		
		return LoginServiceImpl;
	}
	
	@Override
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}

	@Override
	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}

	@Override
	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(userName, password);
	}

	@Override
	public String authorization(String userName) {
		// TODO Auto-generated method stub
		return dao.getUserType(userName);
	}

	@Override
	public void resetStatus(String id) {
		dao.resetStatus(id);
		
	}

	@Override
	public void inceraseAttempt(String id, int val) {
		dao.inceraseAttempt(id, val);
	}

	@Override
	public boolean checkUser(String id) {
		// TODO Auto-generated method stub
		return dao.checkUser(id);
	}




}
