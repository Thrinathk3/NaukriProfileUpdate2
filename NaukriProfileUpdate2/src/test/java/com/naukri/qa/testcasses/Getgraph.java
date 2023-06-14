package com.naukri.qa.testcasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Getgraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("k.thrinath@outlook.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Thrinath@1997");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer']")).click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-per-title' and text()='Search Appearances']")).click();
		
		WebElement s=driver.findElement(By.xpath("//canvas[@id='trendChart']"));
		System.out.println("printed");
		Point point =s.getLocation();
		int x =point.getX();
		int y=point.getY();
		//System.out.println(x+"+"+y);
		Actions act = new Actions (driver);
		act.moveToElement(s, x, y).build().perform();

	}

}
