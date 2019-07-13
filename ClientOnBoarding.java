package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ClientOnBoarding extends TestBase{

	@FindBy(xpath="//span[text()='On Boarding']")
	WebElement onboard;
	
	//OnBoarding Elements
	@FindBy(id="company_name")
	WebElement cmpname;
	
	@FindBy(id="website")
	WebElement website;
	
	@FindBy(id="address_line1")
	WebElement address1;
	
	@FindBy(id="address_line2")
	WebElement address2;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="alternate_number")
	WebElement alternateno;
	
	@FindBy(xpath="//span[@id='select2-country-container']")
	WebElement country;
	
	@FindBy(xpath="//li[text()='United States']")
	WebElement selectctr;
	
	@FindBy(xpath="//span[@id='select2-state-container']")
	WebElement state;
	
	@FindBy(xpath="//li[text()='Alabama']")
	WebElement selectstate;
	
	@FindBy(xpath="//span[@id='select2-cities-container']")
	WebElement city;
	
	@FindBy(xpath="//li[text()='Alabaster']")
	WebElement selectcity;
	
	@FindBy(xpath="//*[@id=\"industry_error\"]/div/span/span[1]/span/ul")
	WebElement industry;
	
	@FindBy(xpath="//li[text()='Advertising']")
	WebElement selectind;
	
	@FindBy(id="zip_code")
	WebElement zipcode;
	
	@FindBy(xpath="//a[text()='Next']")
	WebElement next;
	
	
	//Business Card info
	@FindBy(id="primary_name")
	WebElement pirmaryname;
	
	@FindBy(id="primary_designation")
	WebElement destination;
	
	@FindBy(id="primary_directdial")
	WebElement directdial;
	
	@FindBy(id="primary_email")
	WebElement primaryemail;
	
	@FindBy(id="secondary_name")
	WebElement secondname;
	
	@FindBy(id="secondary_designation")
	WebElement seconddestination;
	
	@FindBy(id="secondary_directdial")
	WebElement seconddirectdial;
	
	@FindBy(id="secondary_email")
	WebElement semail;
	
	
	
	
	public ClientOnBoarding()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonobbaord(String cname,String web,String add1,String add2,String ph,String altno,String zip)
	{
		onboard.click();
		cmpname.sendKeys(cname);
		website.sendKeys(web);	
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		phone.sendKeys(ph);
		alternateno.sendKeys(altno);
		country.click();
		selectctr.click();
		state.click();
		selectstate.click();
		city.click();
		selectcity.click();
		industry.click();
		selectind.click();
		zipcode.sendKeys(zip);
		next.click();
		
	}
	public void bussinesscardinfo(String pname,String dest,String direct1,String email1,String sname,String dest2,String direct2,String email2)
	{
		pirmaryname.sendKeys(pname);
		destination.sendKeys(dest);
		directdial.sendKeys(direct1);
		primaryemail.sendKeys(email1);
		
		secondname.sendKeys(sname);
		seconddestination.sendKeys(dest2);
		seconddirectdial.sendKeys(direct2);
		semail.sendKeys(email2);
		next.click();
		
		
		
	}
	
}
