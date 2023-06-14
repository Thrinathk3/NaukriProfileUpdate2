package com.naukri.qa.testcasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.LoginPage;
import com.naukri.qa.pages.LogoutPage;
import com.naukri.qa.pages.UpdateProfile;
import com.naukri.qa.util.TestUtil;

public class UpdateProfileTest extends TestBase{
		LoginPage loginPage;
		UpdateProfile updateProfile;
		LogoutPage logout;
		TestUtil testutil;
		
		public UpdateProfileTest() {
			super();
		}
		
		@BeforeMethod
		public void setup() throws InterruptedException {
			initialization();
			loginPage = new LoginPage();
			logout =new LogoutPage();
			updateProfile = new UpdateProfile();
			testutil = new TestUtil();
			loginPage.login(prop.getProperty("username4"), prop.getProperty("password4"));
			updateProfile.updateMyProfile();
		}
		@Test(enabled=false)
		public void verifyProfilePageTitleTest() throws InterruptedException {
			String pt=updateProfile.verifyProfilePageTitle();
			Assert.assertEquals(pt, prop.getProperty("profilepagetitle"));
		}
		@Test(enabled=true)
		public void resumeUpdateTest() throws InterruptedException {
			String date=updateProfile.resumeUpdate(); 		
			String currentDate = TestUtil.date();
			System.out.println("Resume Updated on "+currentDate);
			Assert.assertEquals(date, "Uploaded on " +currentDate );
		}
		
		@AfterMethod
		public void teardown() {
			logout.logout();
			driver.quit();
		}
}
