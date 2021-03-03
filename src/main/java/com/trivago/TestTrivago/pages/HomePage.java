package com.trivago.TestTrivago.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trivago.TestTrivago.base.Base;

public class HomePage extends Base{
	
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"querytext\"]")
	public WebElement SearchTextBox;
	
	@FindBy(xpath = "//*[@id=\"ssg-suggestions\"]/li[1]")
	public WebElement suggestion1;
	
	
	@FindBy(xpath = "//button[@class='cal-btn-next']")
	public WebElement moveDate;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
