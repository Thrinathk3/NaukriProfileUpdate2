package com.naukri.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page factory or Object Repository
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	WebElement username;

	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement password;

	@FindBy(xpath="//a[@id='login_Layer']")
	WebElement loginbtn1;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn2;

	@FindBy(xpath="//a[text()='Register for free']")
	WebElement register;

	@FindBy(xpath="//div[h1='Find your dream job now']")
	WebElement header;
	
	@FindBy(xpath="//div[@class='chatbot_Nav']")
	WebElement chatbox;

	//initializing  the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHeader() {
		return header.isDisplayed();
	}

	public HomePage login(String un, String pwd) throws InterruptedException {
		loginbtn1.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn2.click();
		Thread.sleep(5000);
		try {
			chatbox.click();
		}catch(Exception e) {
			
		}
		return new HomePage();
	}
}
