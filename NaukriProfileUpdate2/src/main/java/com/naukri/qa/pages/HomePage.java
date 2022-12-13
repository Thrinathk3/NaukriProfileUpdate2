package com.naukri.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//div[text()='Kappala Thrinath']")
	WebElement userNameLabel;
	
	@FindBy(xpath="//div[text()='UPDATE PROFILE']")
	WebElement updateProfile;
	
	@FindBy(xpath="//div[@class='nI-gNb-drawer']")
	WebElement drawer;
	
	@FindBy(xpath="//a[text()='View & Update Profile']")
	WebElement viewProfile;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//div[text()='Search Appearances']")
	WebElement profileSummary;
	
	@FindBy()
	WebElement jobs;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() throws InterruptedException {
		Thread.sleep(5000);
		return driver.getTitle();
	}
	
	public String verifyUserNameLabe() {
		return userNameLabel.getText();
	}
	public JobsPage clickonJobslink() {
		jobs.click();
		return new JobsPage();
	}
	public ProfileSummaryPage ProfieSummary() {
		drawer.click();
		viewProfile.click();
		return new ProfileSummaryPage();
	}
	public SearchPage search() {
		return new SearchPage();
	}
} 
