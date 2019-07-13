package com.test;	

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.CreateNormalCamp;
import com.pages.LoginPage;

public class CreateNormalCampTest extends TestBase {
	
	public CreateNormalCampTest()
	{
		super();
	}

	@Test
	public void setup() throws InterruptedException
	{
		initial();
		LoginPage logpage=new LoginPage();
		logpage.login(prop.getProperty("uname"),prop.getProperty("pass"));
		CreateNormalCamp log =new CreateNormalCamp();
		log.clickoncamp();
		log.createcampmethod(prop.getProperty("ionumber"),prop.getProperty("campname"),prop.getProperty("description"),prop.getProperty("currency"),prop.getProperty("targetQty"),prop.getProperty("tctargetqty"));
		
	}
}
