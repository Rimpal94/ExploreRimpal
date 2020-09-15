package org.Demo.ECommerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.Demo.Library.Browser;
import org.Demo.UIPackage.LoginPage;
import org.Demo.UIPackage.MyCart;
import org.Demo.UIPackage.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Flipkart extends Browser{
	
	
  @Test
  public void test() throws InterruptedException   {
	  
	  LoginPage lp= new LoginPage(driver);
	  lp.LoginToFlipkart("rimpalkundu@gmail.com", "rimpal");
	  Product product =new Product(driver);
	  product.SearchProduct("iPhone 6s plus");
	 
	  /* MyCart mycart= new MyCart(driver);
	  mycart.AddToCart(); */
  }
  @BeforeTest
  public void beforeTest() 
  {
	  Browser.StartBrowser("Chrome","https://www.flipkart.com/");
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
	 driver.quit();
  }

}
