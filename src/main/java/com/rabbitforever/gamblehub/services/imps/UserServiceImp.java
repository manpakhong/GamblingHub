package com.rabbitforever.gamblehub.services.imps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rabbitforever.gamblehub.daos.UserDao;
import com.rabbitforever.gamblehub.models.eos.UserEo;
import com.rabbitforever.gamblehub.services.UserService;
@Service("userService")
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Transactional(readOnly = true)
	@Override
	public UserEo loadUserByUserName(String userName) throws Exception {
		
		UserEo userEo = userDao.findUserByUserName(userName);
		
		UserBuilder builder = null;
		if (userEo != null) {
			builder = User.withUsername(userName);
			builder.disabled(!userEo.getEnabled());
			builder.password(userEo.getPassword());
		}
		
		return userEo;
	}

}
