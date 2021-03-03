package com.trivago.TestTrivago.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver=null;
	String url;
	String pathOfChromeDriver=System.getProperty("user.dir")+"\\src\\main\\java\\com\\trivago\\TestTrivago\\driver\\chromedriver.exe";
	protected String email=null;
	protected String password=null;
	public Base() {
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\bk56379\\eclipse-workspace\\TestTrivago\\src\\main\\java\\com\\trivago\\TestTrivago\\config\\Config.properties");
			Properties prop=new Properties();
			prop.load(fis);
			url=prop.getProperty("url");
			email=prop.getProperty("userEmail");
			password=prop.getProperty("password");
			System.out.println(url);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void init() {
		System.setProperty("webdriver.chrome.driver",pathOfChromeDriver);
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

}
