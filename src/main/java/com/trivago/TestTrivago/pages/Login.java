package com.trivago.TestTrivago.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trivago.TestTrivago.base.Base;

public class Login extends Base{
	
	@FindBy(xpath = "//*[@id='check_email']")
	public WebElement enterEmail;
	
	@FindBy(xpath = "//button[@id='login_email_submit']")
	public WebElement submitUserEmail;
	
	@FindBy(xpath = "//*[@id=\"login_password\"]")
	public WebElement enterPassword;
	
	@FindBy(xpath = "//*[@id=\"login_submit\"]")
	public WebElement loginSubmit;
	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
