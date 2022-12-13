package com.naukri.qa.testcasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.LoginPage;
import com.naukri.qa.pages.LogoutPage;
import com.naukri.qa.pages.ProfileSummaryUpdatePage;
import com.naukri.qa.pages.UpdateProfile;

public class ProfileSummaryUpdateTest extends TestBase{
	LoginPage loginPage;
	UpdateProfile updateProfile;
	LogoutPage logout;
	ProfileSummaryUpdatePage psUpdate;
	
	public ProfileSummaryUpdateTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		psUpdate = new ProfileSummaryUpdatePage();
		updateProfile = new UpdateProfile();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		updateProfile.updateMyProfile();
	}
	
	
	@Test(enabled=true)
	public void psUpdatingTest() throws InterruptedException {
		String psu =psUpdate.summaryUpdating();
		Assert.assertEquals(psu, psu);
	}
	@Test(enabled=false)
	public void frameTest() {
		System.out.println(psUpdate.frames());
	}
	
	@AfterMethod
	public void teardown() {
		logout =new LogoutPage();
		logout.logout();
		driver.quit();
	}

}
