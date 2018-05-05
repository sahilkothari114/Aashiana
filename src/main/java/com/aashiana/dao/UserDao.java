package com.aashiana.dao;

import java.awt.print.Book;
import java.util.List;
import com.aashiana.dto.User;

public class UserDao extends HibernateUtil implements DAOInterface<User, String> {

	public void persist(User entity) {
		// TODO Auto-generated method stub
		getCurrentSession().save(entity);
	}

	public void update(User entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);
	}

	public User findById(String id) {
		// TODO Auto-generated method stub
		User user = getCurrentSession().get(User.class, id);
		return user;
	}

	public void delete(User entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);
	}

	public List<User> findAll(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll(String id) {
		// TODO Auto-generated method stub
		
	}
}
