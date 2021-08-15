package org.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class AdactinImplementation {

	public static WebDriver driver;
	
	@Test
	 public void login()
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\AdactinUsingPOM\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		System.out.println("login in Adactin hotel");
	 }
	
	@AfterClass
	public void logOut()
	{
		System.out.println("End of the program");
	}
	
	
	
}
