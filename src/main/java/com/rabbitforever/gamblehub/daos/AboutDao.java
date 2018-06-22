package com.rabbitforever.gamblehub.daos;

import com.rabbitforever.gamblehub.models.eos.AboutEo;

public interface AboutDao {
	public AboutEo findAboutById(Integer id);
}
