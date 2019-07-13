package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Tc_Register;

public class Tc_RegisterTest extends TestBase {
	
	public Tc_RegisterTest()
	{
		super();
		
	}
	@BeforeMethod
	public void demo_reg()
	{
		initial();
		Tc_Register reg=new Tc_Register();
		reg.clickonCreateCamp();
	}
	@Test
	public void setup()
	{
		
		
		Tc_Register reg=new Tc_Register();
		
	
		reg.register(prop.getProperty("em"),prop.getProperty("ps"),prop.getProperty("cp"));
		
		reg.selectuser();
		reg.clickbtn();
		
	}

}
