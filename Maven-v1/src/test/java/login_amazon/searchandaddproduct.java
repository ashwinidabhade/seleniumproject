package login_amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchandaddproduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //open url
		  driver.get("https://www.amazon.in/");  
		  
		  //find product in search box
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		  
		  //search product
		  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		  
		  driver.findElement(By.linkText("Apple iPhone 14 128GB (Product) RED")).click();
			
		  driver.findElement(By.id("add-to-cart-button")).click();
		  
		  driver.close();
		  
	}

	 
 
}

