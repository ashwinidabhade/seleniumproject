package login_amazon;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class registeration {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriverManager.chromedriver().setup();
	  
  WebDriver driver = new ChromeDriver();

      driver.get("https://www.amazon.in/");  
      Thread.sleep(2000);
      
      	
		  driver.findElement(By.id("nav-link-accountList")).click(); 
		  driver.findElement(By.className("nav-action-inner")).click();	
		  //driver.findElement(By.id("ap_email")).moveToElement(element).perform();
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.id("createAccountSubmit"))).click();			/*
			 * action(driver).moveToElement(element).perform();
			 * //Actions(driver).moveToElement(element).perform();
			 */		
		  //driver.findElement(By.id("createAccountSubmit")).click();
		  driver.findElement(By.id("ap_customer_name")).sendKeys("Ashwini");
		  driver.findElement(By.id("ap_phone_number")).sendKeys("8329434792");
		  driver.findElement(By.id("ap_email")).sendKeys("asdabhade28@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("ashwini123");
		  driver.findElement(By.id("continue")).click();
      driver.close();
  }
	  
  


}
