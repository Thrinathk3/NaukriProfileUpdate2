package com.naukri.qa.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class ProfileAction extends  TestBase{
	@FindBy (xpath="//span[@class='summary-card__search-appearance--value']")
	WebElement searchValue;
	
	@FindBy (xpath="//div[@class='searchAppWrapper']//span[@class='count']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='nI-gNb-drawer']")
	WebElement drawer;
	
	@FindBy(xpath="//span[@class='summary-card__recruiter-actions--value']")
	WebElement act;
	
	
	
	public ProfileAction () {
		PageFactory.initElements(driver, this);
	}
	
	public void updateMyProfile() {
		//drawer.click();
		//Actions act= new Actions(driver);
		//act.moveToElement(search).click();
		search.click();		
	}
	
	public String verifySearchPageTitle() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(searchValue.getText()+" Search Appearances");
		System.out.println(act.getText()+" Recruiter Actions");
		return driver.getTitle();		
	}
	
}
