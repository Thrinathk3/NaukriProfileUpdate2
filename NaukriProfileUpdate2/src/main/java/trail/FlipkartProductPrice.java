package trail;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartProductPrice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		String url="https://www.flipkart.com/";
		String product="iPhone mobile";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(product);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		List<WebElement> pPrice=driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement> pName=driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']/descendant::div[@class='_4rR01T']"));
		System.out.println("S.NO\tproductName\t\t\t\t\tproductPrice");
//		for(int i =1;i<=24;i++) {
//			String productPrice=driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
//			String productName=driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[@class='_4rR01T']")).getText();
//			
//			System.out.println(i+"\t"+productName+"\t\t"+productPrice);
//		}
		for(int i =1;i<pPrice.size();i++) {
				System.out.println(i+"\t"+pName.get(i).getText()+"\t\t"+pPrice.get(i).getText());
		}
		
		driver.quit();
	}
		
}
