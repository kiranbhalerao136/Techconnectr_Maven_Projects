package com.test;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {

	public LoginPageTest()
	{
		super();
		
	}
	@Test
	public void setup()
	{
		initial();
		LoginPage log =new LoginPage();
		log.login(prop.getProperty("uname"), prop.getProperty("pass"));
		
		
	}
}
