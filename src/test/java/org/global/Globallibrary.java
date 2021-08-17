package org.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Globallibrary {

	  public static WebDriver driver;
	  
	  public void getDriver()
	  {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\AdactinUsingPOM\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://adactinhotelapp.com/");
	  }
	  
}
