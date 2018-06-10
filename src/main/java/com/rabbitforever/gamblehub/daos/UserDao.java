package com.rabbitforever.gamblehub.daos;

import com.rabbitforever.gamblehub.models.eos.UserEo;

public interface UserDao {
	public UserEo findUserByUserName(String userName);
}
