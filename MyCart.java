package org.Demo.UIPackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.Demo.Library.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCart extends Browser{
@FindBy(xpath ="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']//*[local-name()='svg']")
@CacheLookup
WebElement cart;

public MyCart(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public void Cart() {
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(cart));
	cart.click(); 
	
	
	
}
/*public void Window() throws InterruptedException {
	Set<String> allWindowHandles = driver.getWindowHandles(); 
	for(String handle : allWindowHandles)
	{
	System.out.println("Window handle - > " + handle);
	
	}
	ArrayList<String> tabs = new  ArrayList<>(allWindowHandles);
    driver.switchTo().window(tabs.get(1));
    Thread.sleep(3000);
    System.out.println("Switch");
	
} */

public void AddToCart() throws InterruptedException {
	
	Thread.sleep(3000);
	this.Cart();
	Thread.sleep(3000);
	//this.Window();
}

}
