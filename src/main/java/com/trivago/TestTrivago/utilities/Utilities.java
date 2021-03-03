package com.trivago.TestTrivago.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {

	public void waitTillPageLoadsCompletly(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("return document.readyState").toString().equals("complete");
	}
	
	public void scrollDownPane(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
	}
	
	public boolean isElementPresent(WebElement ele,WebDriver driver) {
		boolean isPresent;
		
		if(!driver.findElements(By.id("sampleHeading")).isEmpty()) {
		isPresent=true;
		}else {
			isPresent=false;
		}
		return isPresent;
	}
	
}
