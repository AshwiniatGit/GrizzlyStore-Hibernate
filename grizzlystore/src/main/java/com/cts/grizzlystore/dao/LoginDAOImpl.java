package com.cts.grizzlystore.dao;

import java.sql.Connection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cts.grizzlystore.bean.User;
import com.cts.grizzlystore.service.UserService;
import com.cts.grizzlystore.service.UserServiceImpl;
import com.cts.grizzlystore.util.HibernateUtil;

public class LoginDAOImpl implements LoginDAO {
	
	private Connection connection =null;
	private static LoginDAOImpl loginDAOImpl;
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	private LoginDAOImpl(){
		
	}
	
	public static LoginDAOImpl getInstance(){
		
		if(loginDAOImpl == null)
			loginDAOImpl = new LoginDAOImpl();
		return loginDAOImpl;
	}

	@Override
	public int getUserStatus(String id) {
		Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<User> query = builder.createQuery(User.class);
	         Root<User> root = query.from(User.class);
	         query.select(root).where(builder.equal(root.get("userId"),id));
	         Query<User> q=session.createQuery(query);
	         User user=q.getSingleResult();
	         transaction.commit();
	         return user.getStatus();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
		
		
		return 0;
	}

	@Override
	public String getUserType(String id) {
		Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<User> query = builder.createQuery(User.class);
	         Root<User> root = query.from(User.class);
	         query.select(root).where(builder.equal(root.get("userId"),id));
	         Query<User> q=session.createQuery(query);
	         User user=q.getSingleResult();
	         transaction.commit();
	         return user.getUserType();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
		
		
		return null;
	}

	@Override
	public boolean authenticate(String userName, String password) {
		return false;
	}

	@Override
	public boolean checkUser(String id) {
	Session session= null;
		try{
		session = sessionFactory.openSession();
		User user = session.load(User.class, id);
		return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		
	}

	@Override
	public void resetStatus(String id) {
		
		UserService userService = UserServiceImpl.getInstance();
		User user = userService.getUser(id);
		user.setStatus(0);
		Session session= null;
		Transaction transaction = null;
		try{
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		
		transaction.begin();
		session.update(user);//insert 
		transaction.commit();
		System.out.println("Updated");
		
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
		
		
	}

	@Override
	public void inceraseAttempt(String id, int val) {
		
		UserService userService = UserServiceImpl.getInstance();
		User user = userService.getUser(id);
		user.setStatus(val+1);
		Session session= null;
		Transaction transaction = null;
		try{
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		
		transaction.begin();
		session.update(user);//insert 
		transaction.commit();
		System.out.println("Updated");
		
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
		
		
		
	}
	
	

}
