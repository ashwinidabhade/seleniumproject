package login_amazon;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class registeration {
  @Test
  public void reg() throws InterruptedException 
  {
	  WebDriverManager.chromedriver().setup();
	  
  WebDriver driver = new ChromeDriver();
  
      driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=PBCVQFGKZC802CQ55QW0&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");  
      Thread.sleep(2000);
      
      	
		  driver.findElement(By.id("ap_customer_name")).sendKeys("Ashwini") ;
		  
			/*
			 * WebElement testDropDown =
			 * driver.findElement(By.className("a-dropdown-prompt")); Select dropdown = new
			 * Select(testDropDown); dropdown.selectByValue("IN +91");
			 */
		  
		  driver.findElement(By.id("ap_phone_number")).sendKeys("8329434792");
		  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("asdabhade28@gmail.com");
		  driver.findElement(By.cssSelector("#ap_password")).sendKeys("123456");
		  Thread.sleep(1000);
		  driver.findElement(By.id("continue")).click();
		  
			/*
			 * Actions action = new Actions(driver);
			 * action.moveToElement(driver.findElement(By.id("createAccountSubmit"))).click(
			 * );
			 */		/*
			 * action(driver).moveToElement(element).perform();
			 * //Actions(driver).moveToElement(element).perform();
			 */		
		  //driver.findElement(By.id("createAccountSubmit")).click();
		  
      driver.close();
  }
	  
  


}
