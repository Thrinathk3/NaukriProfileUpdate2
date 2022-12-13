package com.naukri.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class LogoutPage extends TestBase{
	
	@FindBy(xpath="//div[@class='nI-gNb-drawer']")
	WebElement drawer;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public LogoutPage() {
		 PageFactory.initElements(driver, this);
	}
	
	public void logout() {
		drawer.click();
		logout.click();
		//System.out.println("Logout Success");
	}
}
