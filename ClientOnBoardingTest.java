package com.test;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ClientOnBoarding;


public class ClientOnBoardingTest extends TestBase{

	public ClientOnBoardingTest()
	{
		super();
		
	}
	@Test
	public void setup() throws InterruptedException
	{
		LoginPageTest log=new LoginPageTest();
		log.setup();
		ClientOnBoarding ob=new ClientOnBoarding();
		ob.clickonobbaord(prop.getProperty("cmpname"),prop.getProperty("website"),prop.getProperty("address1"),
		prop.getProperty("address2"),prop.getProperty("phone"),prop.getProperty("alternateno"),prop.getProperty("zipcode"));
		
		ob.bussinesscardinfo(prop.getProperty("pirmaryname"),prop.getProperty("destination"),prop.getProperty("directdial"),prop.getProperty("primaryemail"),prop.getProperty("secondname"),
				prop.getProperty("seconddestination"),prop.getProperty("seconddirectdial"),prop.getProperty("semail"));
		
			
	}

}
