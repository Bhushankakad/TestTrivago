package com.trivago.TestTrivago.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.trivago.TestTrivago.base.Base;
import com.trivago.TestTrivago.pages.HomePage;
import com.trivago.TestTrivago.pages.Login;
import com.trivago.TestTrivago.utilities.Utilities;

public class TestTrivago extends Base{
	HomePage home=null;
	Login login=null;
	Utilities util=new Utilities();
	@BeforeClass
	public void test1() {
		init();
		home=new HomePage(driver);
		login=new Login(driver);
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		/*
		 * //Click on login button home.loginButton.click();
		 * util.waitTillPageLoadsCompletly(driver); login.enterEmail.click();
		 * login.enterEmail.sendKeys(email); JavascriptExecutor
		 * jse=(JavascriptExecutor)driver; jse.executeScript("arguments[0].click();",
		 * login.submitUserEmail); //login.submitUserEmail.click();
		 * util.waitTillPageLoadsCompletly(driver); System.out.println("bHUSHAN");
		 * jse.executeScript("arguments[0].click()", login.enterPassword);
		 * Thread.sleep(5000);; login.enterPassword.sendKeys("KRiss@@4994");
		 * login.loginSubmit.click();
		 */
	}
	
	@Test
	public void test2() throws InterruptedException {
		home.SearchTextBox.click();
		home.SearchTextBox.sendKeys("Mumbai");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		home.suggestion1.click();
		util.scrollDownPane(driver);
		
		for(int i=0;i<=11;i++) {
			Thread.sleep(2000);
			home.moveDate.click();
		}
		boolean flag=false;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=7;j++) {
				String txt=driver.findElement(By.xpath("//table[@class='cal-month']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(txt);
				if(txt.contains("15" )) {
					driver.findElement(By.xpath("//table[@class='cal-month']//tbody/tr["+i+"]/td["+j+"]")).click();
					flag=true;
					break;
				}
			}
			
			if(flag==true) {
				break;
			}
		}
		home.moveDate.click();
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=7;j++) {
				String txt1=driver.findElement(By.xpath("//table[@class='cal-month']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(txt1);
				if(txt1.contains("20")) {
					driver.findElement(By.xpath("//table[@class='cal-month']//tbody/tr["+i+"]/td["+j+"]")).click();
					flag=true;
					break;
				}
			}
			
			if(flag==true) {
				break;
			}
		}
	}
}
