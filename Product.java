package org.Demo.UIPackage;

import org.Demo.Library.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product extends Browser {

	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	@CacheLookup
	WebElement Globalsearch;
	@FindBy(xpath = "//button[@class='vh79eN']//*[local-name()='svg']")
	@CacheLookup
	WebElement submit;
	@FindBy(xpath = "//div[contains(text(),'Internal Storage')]")
	@CacheLookup
	WebElement Capacity;
	@FindBy(xpath = "//div[@class='_1GEhLw'][contains(text(),'16 - 31.9 GB')]")
	@CacheLookup
	WebElement SixteenGB;
	@FindBy(xpath = "//div[contains(text(),'Apple iPhone 6s (Space Grey, 16 GB)')]")
	@CacheLookup
	WebElement iphone;
	@FindBy(xpath = "//span[@class='_2aK_gu']")
	@CacheLookup
	WebElement change;
	@FindBy(xpath = "//input[@id='pincodeInputId']")
	@CacheLookup
	WebElement pincode;

	public Product(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Search(String ProductName) {
		// TODO Auto-generated method stub
		Globalsearch.sendKeys(ProductName);
	}

	public void Submit() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}

	public void Storage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// js.executeScript("arguments[0].scrollIntoView();", Capacity);
		Capacity.click();
	}

	public void GB() {
		// TODO Auto-generated method stub
		SixteenGB.click();
	}

	public void AppleIphone() {
		// TODO Auto-generated method stub
		iphone.click();
	}

	public void AreaPincode() {
		// TODO Auto-generated method stub
		// change.click();
		pincode.getText();
	}

	public void SearchProduct(String ProductName) throws InterruptedException {

		Thread.sleep(2000);
		this.Search(ProductName);

		Thread.sleep(1000);
		this.Submit();

		Thread.sleep(3000);
		this.Storage();

		Thread.sleep(3000);
		this.GB();

		Thread.sleep(2000);
		this.AppleIphone();

		/*
		 * Thread.sleep(2000); this.AreaPincode();
		 */

		Thread.sleep(3000);

	}
}
