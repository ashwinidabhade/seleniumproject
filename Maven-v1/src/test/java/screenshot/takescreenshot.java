package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takescreenshot {
  @Test
  public void takescreenshot() throws InterruptedException, IOException 
  {
	  WebDriverManager.chromedriver().setup();
	  
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
 
      driver.get("https://www.amazon.in/?");
      Thread.sleep(2000);
     
     //Type casting
     TakesScreenshot ts=(TakesScreenshot)driver;
     
     //Take screenshot
     File src=ts.getScreenshotAs(OutputType.FILE);
     
     //Store Screenshot
     FileHandler.copy(src, new File("D.\\amazon.png"));
     
     driver.close();
     
  }
}
