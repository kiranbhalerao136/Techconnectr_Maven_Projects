package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class CreateNormalCamp extends TestBase{

	//Login 
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(css=".login_btn")
	WebElement click;
	
	//Create Campaign
	
	
	@FindBy(xpath="//*[@id=\"bt\"]")
	WebElement clickonCreateCamp;
	
	@FindBy(id="my-dropdown")
	WebElement camptype;
	
	@FindBy(xpath="//*[@id=\"centertext\"]/a/button")
	WebElement createcampbtn1;
	
	@FindBy(name="io_number")
	WebElement ionumber;
	
	@FindBy(id="id_name")
	WebElement campname;
	
	@FindBy(id="id_description")
	WebElement description;
	
	@FindBy(id="id_type")
	WebElement selectCamptype;
	
	@FindBy(xpath="//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/button")
	WebElement outreachmethod;
	
	@FindBy(xpath="//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[2]/a/label")
	WebElement selectoutmenthod;
	
	@FindBy(id="currency-field1")
	WebElement currency;
	
	@FindBy(id="currency-field2")
	WebElement targetQty;
	
	@FindBy(id="currency-field3")
	WebElement tctargetqty;
	
	@FindBy(xpath="//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[10]/div/div/div/div/input[2]")
	WebElement startdate;
	
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/div/span[16]")
	WebElement selectDate;
	
	@FindBy(xpath="//*[@id=\"validate_campaign\"]/fieldset/div[1]/div[11]/div/div/div/div/input[2]")
	WebElement enddate;
	
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/div[2]/div/span[20]")
	WebElement selectenddate;
	
	@FindBy(id="id_tc_vendor")
	WebElement tcvendor;
//	
//	@FindBy(xpath="//*[@class=\"form-horizontal\"]/fieldset[1]/div/div[13]/div/div/div[1]/button/span")
//	WebElement submitbtn;
	
	@FindBy(xpath="//*[@class=\"form-horizontal\"]/fieldset[1]/div[1]/div[13]/div[1]/div[1]/div[1]/button")
	WebElement submitbtn;
	
	public CreateNormalCamp()
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un,String ps)
	{
		uname.sendKeys(un);
		pass.sendKeys(ps);
		click.click();
		
	}
	public void clickoncamp() throws InterruptedException
	{
		Thread.sleep(4000);
		clickonCreateCamp.click();
		Select s1=new Select(camptype);
		s1.selectByVisibleText("Campaign Set-up");
		Thread.sleep(3000);
		createcampbtn1.click();
		
		Select s2=new Select(selectCamptype);
		s2.selectByValue("2");
		
	}
//	public void selectcamptype()
//	{
//		Select s1=new Select(camptype);
//		s1.selectByVisibleText("Campaign Set-up");
//	}
//	public void clickbtnoncamp() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		createcampbtn1.click();
//	}
	public void createcampmethod(String iono,String campname1,String description1,String curr,String tcq,String tcqty) throws InterruptedException
	{
		Thread.sleep(3000);
		ionumber.sendKeys(iono);
		campname.sendKeys(campname1);
		description.sendKeys(description1);
		
		selectCamptype.click();
		selectCamptype.click();
		outreachmethod.click();
		selectoutmenthod.click();
		outreachmethod.click();
		currency.sendKeys(curr);
		targetQty.sendKeys(tcq);
		tctargetqty.sendKeys(tcqty);
		startdate.click();
		selectDate.click();
		enddate.click();
		selectenddate.click();
		tcvendor.click();
		Thread.sleep(4000);
		submitbtn.click();
		
	}
}
