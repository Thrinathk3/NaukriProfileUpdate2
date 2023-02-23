package com.naukri.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class UpdateProfile extends TestBase{
	@FindBy(xpath="//div[@class='nI-gNb-drawer']")
	WebElement drawer;
	
	@FindBy(xpath="//a[text()='View & Update Profile']")
	WebElement viewProfile;
	
	@FindBy(xpath="//input[@id='attachCV']")
	WebElement updateResume;
	
	@FindBy(xpath="//span[@class='updateOn']")
	WebElement updateOn;
	
	public UpdateProfile() {
		PageFactory.initElements(driver, this);
	}
	
	public void updateMyProfile() {
		drawer.click();
		viewProfile.click();
	}
	
	public String verifyProfilePageTitle() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
	}
	public String resumeUpdate() throws InterruptedException {
		Thread.sleep(20000);
		updateResume.sendKeys("C:\\Users\\tingu\\eclipse-workspace\\NaukriProfileUpdate\\resource\\Thrinath_K.pdf");
		Thread.sleep(20000);
		return updateOn.getText();
	}
	
}
