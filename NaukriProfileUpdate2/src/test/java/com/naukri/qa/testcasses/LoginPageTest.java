package com.naukri.qa.testcasses;

import org.testng.Assert;
import org.testng.annotations.*;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.HomePage;
import com.naukri.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginPage=new LoginPage();		
	}
	
	@Test(enabled=false)
	public void loginPageTitle() {
		String title=loginPage.validateTitle();
		Assert.assertEquals(title, prop.getProperty("loginpagetitle"));;
	}
	@Test(enabled=false)
	public void headerTest() {
		boolean h=loginPage.validateHeader();
		Assert.assertTrue(h);
	}
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();;
	}

}
