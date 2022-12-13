package com.naukri.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.qa.base.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy(xpath="//input[@id='qsb-keyskill-sugg']")
	WebElement search;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbtn;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	public void searching() {
		search.sendKeys(prop.getProperty("searchtext"));
		searchbtn.click();
	}

}
