package com.naukri.qa.testcasses;

import org.testng.Assert;
import org.testng.annotations.*;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.*;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	LogoutPage logoutPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage= new LoginPage();
		logoutPage = new LogoutPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(enabled=false)
	public void verifyHomePageTitleTest() throws InterruptedException{
		String htitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(htitle, prop.getProperty("homepagetitle"));
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		String uname=homePage.verifyUserNameLabe();
		Assert.assertEquals(uname, prop.getProperty("usernamelabel"),"UserNameLogo Not Matched");
	}
	
	@AfterMethod
	public void teardown() {
		logoutPage.logout();
		driver.quit();
	}

}
