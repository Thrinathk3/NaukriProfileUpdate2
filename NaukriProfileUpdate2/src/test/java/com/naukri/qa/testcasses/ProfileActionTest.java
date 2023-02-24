package com.naukri.qa.testcasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.LoginPage;
import com.naukri.qa.pages.LogoutPage;
import com.naukri.qa.pages.ProfileAction;

public class ProfileActionTest extends TestBase{
	LoginPage loginPage;
	ProfileAction profileAction;
	LogoutPage logoutPage;
	
	public ProfileActionTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		profileAction = new ProfileAction();
		logoutPage = new LogoutPage();
		loginPage.login(prop.getProperty("username4"), prop.getProperty("password4"));
		profileAction.updateMyProfile();
	}
	@Test
	public void searchTest() throws InterruptedException {
		String title = profileAction.verifySearchPageTitle();
		Assert.assertEquals(title, "Profile Action | Mynaukri");
	}
	
	@AfterMethod
	public void terminate() {
		logoutPage.logout();
		driver.quit();
	}

}
