package trail;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindPrice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		String URL="https://www.flipkart.com/";
		String product="samsung f23";
		String productName, productPrice;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(product);
		//button[@class='L0Z3Pu']
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(7000);
		//List<WebElement> str=driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']"));
		System.out.println("S.NO\tproductName\t\t\t\t\tproductPrice");
		for(int i=1;i<=10;i++) {
			if(i==1) {
				productName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[15]")).getText();
				productPrice = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[24]")).getText();
				System.out.println(i+"\t"+productName+"\t\t"+productPrice);
			}
			else if(i==11) {
				productName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[16]")).getText();
				productPrice = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[24]")).getText();
				System.out.println(i+"\t"+productName+"\t\t"+productPrice);
			}
			else if(i==11) {
				productName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[16]")).getText();
				productPrice = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[23]")).getText();
				System.out.println(i+"\t"+productName+"\t\t"+productPrice);
			}
			else if(i==18) {
				productName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[16]")).getText();
				productPrice = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[23]")).getText();
				System.out.println(i+"\t"+productName+"\t\t"+productPrice);
			}
			else {
				productName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[15]")).getText();
				productPrice = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']["+i+"]/descendant::div[22]")).getText();
				System.out.println(i+"\t"+productName+"\t\t"+productPrice);
			}
		}
		
		
		
		
	}

}
