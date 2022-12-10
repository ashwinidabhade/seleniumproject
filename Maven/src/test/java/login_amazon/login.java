package login_amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException 
	{

		  WebDriverManager.chromedriver().setup();
		  
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      driver.get("https://www.amazon.in/");  
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	      driver.findElement(By.className("nav-action-inner")).click();
	      
	      
	      driver.findElement(By.id("ap_password")).sendKeys("asdabhade62@gmail.com");
	      driver.findElement(By.id("continue")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("ashu9762");
	      driver.findElement(By.id("signInSubmit")).click();
	      
	      
	}

}
