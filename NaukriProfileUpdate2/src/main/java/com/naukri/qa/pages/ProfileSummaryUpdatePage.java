package com.naukri.qa.pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class ProfileSummaryUpdatePage extends TestBase{
	
	@FindBy(xpath="//span[@class='text' and text()='Profile Summary']")
	WebElement summaryUpdate;
	
	@FindBy(xpath="//div[@id='lazyProfileSummary']//child::span[2]")
	WebElement edit;
	
	@FindBy(xpath="//textarea[@id='profileSummaryTxt']")
	WebElement textBox;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement submit;
	
	@FindBy(xpath="//div[@id='lazyProfileSummary']//descendant::div[7]")
	WebElement prefill;
	
	public ProfileSummaryUpdatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String summaryUpdating() throws InterruptedException {
		Thread.sleep(5000);
		summaryUpdate.click();
		edit.click();
		Thread.sleep(5000);
		//driver.switchTo().frame(1);
		//JavascriptExecutor js =(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-150)", "");
		textBox.clear();
		textBox.sendKeys(prop.getProperty("profilesummary"));
		submit.click();
		Thread.sleep(10000);
		return prefill.getText();
	}
	public int frames() {
		summaryUpdate.click();
		edit.click();
		int size = driver.findElements(By.tagName("iframe")).size();
		return size;
	}

}
