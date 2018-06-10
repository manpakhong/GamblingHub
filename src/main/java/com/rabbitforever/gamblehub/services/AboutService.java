package com.rabbitforever.gamblehub.services;

import org.springframework.stereotype.Service;

import com.rabbitforever.gamblehub.models.eos.AboutEo;

@Service("aboutService")
public interface AboutService {

	public AboutEo findAboutById(Integer id);
	
}
