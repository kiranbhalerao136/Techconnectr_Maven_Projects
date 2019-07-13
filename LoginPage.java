package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(css=".login_btn")
	WebElement click;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un,String ps)
	{
		uname.sendKeys(un);
		pass.sendKeys(ps);
		click.click();
		
	}
	
}
