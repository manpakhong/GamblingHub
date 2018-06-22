package com.rabbitforever.gamblehub.daos.imps;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rabbitforever.gamblehub.daos.UserDao;
import com.rabbitforever.gamblehub.models.eos.UserEo;

public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public UserEo findUserByUserName(String userName) {
		return sessionFactory.getCurrentSession().get(UserEo.class, userName);
	}

}
