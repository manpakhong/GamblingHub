package com.rabbitforever.gamblehub.services.imps;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.rabbitforever.gamblehub.models.eos.UserEo;
import com.rabbitforever.gamblehub.services.UserService;
import com.rabbitforever.gamblehub.spring.configs.AppConfig;
@ContextConfiguration(classes = {AppConfig.class})
public class UserServiceImpTest {

	@Autowired
	@Qualifier("userService")
	private UserService service;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoadUserByUserName() throws Exception {
//	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//	    UserEo userEo = context.getBean(UserEo.class);
		UserEo userEo = null;


		service.loadUserByUserName("manpakhong");
		
        assertTrue("userEo should not be null", userEo != null);
	}

}
