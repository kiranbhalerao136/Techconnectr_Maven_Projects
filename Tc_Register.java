package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class Tc_Register extends TestBase{

	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[3]/div/div[2]/a")
	WebElement create_ac;
	
	@FindBy(name="email")
	WebElement em;
	
	@FindBy(name="password")
	WebElement ps;
	
	@FindBy(name="confirmpassword")
	WebElement cp;
	
	@FindBy(name="usertype")
	WebElement ut;
	
	@FindBy(css=".login_btn")
	//@FindBy(xpath="/html/body/div[2]/div/div/div/div/strong/strong/div[1]/form/div/div/div[7]/center/button")
	WebElement register_btn;
	
	
      public Tc_Register()
      {
    	  PageFactory.initElements(driver, this);
    	  
      }
      
      public void clickonCreateCamp()
      {
    	  create_ac.click();
    	  
      }
      public void selectuser()
      {
    	  Select s1=new Select(ut);
    	  s1.selectByVisibleText("client");
      }
      public void register(String em1,String ps1,String cp1)
      {
    	 
    	  
    	  em.sendKeys(em1);
    	  ps.sendKeys(ps1);
    	  cp.sendKeys(cp1);
    	
    	  
    	 
    	
    	  
      }
      public void clickbtn()
      {
    	  register_btn.click();
      }
}
