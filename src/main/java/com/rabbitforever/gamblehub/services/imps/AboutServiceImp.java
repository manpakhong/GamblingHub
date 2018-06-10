package com.rabbitforever.gamblehub.services.imps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rabbitforever.gamblehub.daos.AboutDao;
import com.rabbitforever.gamblehub.models.eos.AboutEo;
import com.rabbitforever.gamblehub.services.AboutService;
@Service("aboutService")
public class AboutServiceImp implements AboutService {
	@Autowired
	private AboutDao aboutDao;
	
	@Transactional(readOnly = true)
	@Override
	public AboutEo findAboutById(Integer id) {
		AboutEo aboutEo = aboutDao.findAboutById(id);
		return null;
	}

}
