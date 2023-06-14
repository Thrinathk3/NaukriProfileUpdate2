package com.naukri.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class UpdateProfile extends TestBase{
	@FindBy(xpath="//div[@class='nI-gNb-drawer']")
	private WebElement drawer;
	
	@FindBy(xpath="//a[text()='View & Update Profile']")
	private WebElement viewProfile;
	
	@FindBy(xpath="//input[@id='attachCV']")
	private WebElement updateResume;
	
	@FindBy(xpath="//span[@class='updateOn']")
	private WebElement updateOn;
	
	@FindBy(xpath="//div[@class='crossIcon chatBot chatBot-ic-cross']")
	private WebElement close;
	
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
		updateResume.sendKeys("C:\\Users\\tingu\\git\\repository4\\NaukriProfileUpdate2\\resource\\Thrinath_K.pdf");
		Thread.sleep(20000);
		try {
			close.click();
		}catch(Exception e) {
			
		}
		return updateOn.getText();
	}
	
}
