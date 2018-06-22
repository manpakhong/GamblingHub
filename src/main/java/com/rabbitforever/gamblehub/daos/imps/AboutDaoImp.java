package com.rabbitforever.gamblehub.daos.imps;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rabbitforever.gamblehub.daos.AboutDao;
import com.rabbitforever.gamblehub.models.eos.AboutEo;

@Repository
public class AboutDaoImp implements AboutDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public AboutEo findAboutById(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(AboutEo.class, id);
	}

}
