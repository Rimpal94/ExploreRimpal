
package org.Demo.Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

public static  WebDriver driver;
public static  WebDriver StartBrowser(String browsername , String url)
{
 // If the browser is Firefox
if(browsername.equalsIgnoreCase("Firefox"))
    {
     // Set the path for geckodriver.exe
     System.setProperty("webdriver.firefox.marionette","  ");
     driver = new FirefoxDriver();
    }

// If the browser is Chrome
 else if(browsername.equalsIgnoreCase("Chrome"))
     {
 // Set the path for chromedriver.exe
	 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\ECommerce\\Driver\\chromedriver.exe");
     driver = new ChromeDriver();
     }

 // If the browser is IE
  else if(browsername.equalsIgnoreCase("IE"))
   {
 // Set the path for IEdriver.exe
     System.setProperty("webdriver.ie.driver","");
     driver = new InternetExplorerDriver();
    }
     
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
     driver.get(url);
     
     return driver;
}
}