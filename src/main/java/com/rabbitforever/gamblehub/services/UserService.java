package com.rabbitforever.gamblehub.services;

import com.rabbitforever.gamblehub.models.eos.UserEo;

public interface UserService {
	public UserEo loadUserByUserName(String userName) throws Exception;

}
