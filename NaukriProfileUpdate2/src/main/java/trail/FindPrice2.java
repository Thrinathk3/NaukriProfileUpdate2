package trail;
/*import java.util.HashSet;
import java.util.List;
import java.util.Set;*/

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindPrice2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		String URL="https://www.flipkart.com/";
		String product="Realme mobile";
		//String productName, productPrice;
		//int c=0;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(product);
		//button[@class='L0Z3Pu']
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(7000);
		//List<WebElement> str=driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/child::div[@class='_1AtVbE col-12-12']"));
		//System.out.println("S.NO\tproductName\t\t\t\t\tproductPrice");
	//	Set<String> val= new HashSet<String>();
		//WebElement dropDown=driver.findElement(By.xpath("//div[@class='_3uDYxP']/child::select"));
		
		//Select select = new Select(dropDown);
		//select.selectByValue("15000");
		Thread.sleep(5000);
		Point s=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/child::div")).getLocation();
		System.out.println(s);
		WebElement slide=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/child::div"));
		Actions act =new Actions(driver);
		//10000=64,381
		//15000=112,381
		//20000=159,381
		//3000=254,331
		for(int i=0;i<4;i++) {
			if(i==3) {
			act.dragAndDropBy(slide, -47, 0).perform();
			Point s2=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/child::div")).getLocation();
			Thread.sleep(5000);
			System.out.println(s2);}
			else {
				act.dragAndDropBy(slide, -48, 0).perform();
				Point s2=driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/child::div")).getLocation();
				Thread.sleep(5000);
				System.out.println(s2);
			}
		}
	}
		
}
