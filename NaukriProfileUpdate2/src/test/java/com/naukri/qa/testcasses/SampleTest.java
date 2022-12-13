package com.naukri.qa.testcasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.naukri.qa.base.TestBase;

public class SampleTest extends TestBase{
	
	public SampleTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@Test
	public void sample() {
		List<WebElement> links =(List<WebElement>) driver.findElements(By.partialLinkText("se"));
		System.out.println(links.size());
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
