package com.aashiana.service;
import com.aashiana.dao.UserDao;
import com.aashiana.dto.User;

public class UserService {
	private static UserDao userDao;

	public UserService() {
		userDao=new UserDao();
	}
	public void persist(User user) {
		userDao.openCurrentSessionWithTransaction();
		userDao.persist(user);
		userDao.closeCurrentSessionWithTransaction();
	}
	
}
