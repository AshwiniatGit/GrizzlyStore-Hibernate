package com.cts.grizzlystore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	private static UserDAOImpl UserDAOImpl;
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	

	private UserDAOImpl(){
	
	}
		
	public static UserDAOImpl getInstance(){
		if(UserDAOImpl==null){
			UserDAOImpl =new UserDAOImpl();
		}
		return UserDAOImpl;
	}
	@Override
	public String addUser(User user) {
		Session session= null;
		Transaction transaction = null;
		try{
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		
		transaction.begin();
		session.save(user);//insert 
		transaction.commit();
		return "success";
		}
		catch(Exception ex){
			ex.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		return null;
	}

	@Override
	public String updateUser(String id, User User) {
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
		Session session= null;
		
		try{
		session = sessionFactory.openSession();
		
		
		User User = session.load(User.class, id);
		return User;
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		return null;
	}

	@Override
	public List<User> getUsersByNames(String name) {
		Session session= null;
		String query ="from Empl where firstName = ?";
		org.hibernate.query.Query<User> query2 = null;

		try{
		session = sessionFactory.openSession();
		query2 = session.createQuery(query);
		query2.setParameter(0, name);
		List<User> list = query2.getResultList();
		return list;
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		return null;
	}

	@Override
	public List<User> getUsers() {
		Session session= null;
		String query ="from Empl";
		org.hibernate.query.Query<User> query2 = null;

		try{
		session = sessionFactory.openSession();
		query2 = session.createQuery(query);
		List<User> list = query2.getResultList();
		return list;
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		return null;
	}

}
