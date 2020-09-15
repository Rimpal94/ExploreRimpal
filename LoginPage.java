package org.Demo.UIPackage;

import org.Demo.Library.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginPage extends Browser{
 
public LoginPage(WebDriver driver){
PageFactory.initElements(driver,this);
}


@FindBy(xpath= "//input[@class='_2zrpKA _1dBPDZ']")
@CacheLookup
WebElement username;
@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
@CacheLookup
WebElement password;
@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
@CacheLookup
WebElement login;
 
public void Username(String setUname) {
	// TODO Auto-generated method stub
	username.sendKeys(setUname);	
}
public void Password(String setPwd) {
	// TODO Auto-generated method stub
	password.sendKeys(setPwd);	
}
public void ClickLogin() {
	// TODO Auto-generated method stub
	login.click();	
} 

public void LoginToFlipkart(String setUname, String setPwd) {
	this.Username(setUname);
	this.Password(setPwd);
	this.ClickLogin();
	
	} 
}