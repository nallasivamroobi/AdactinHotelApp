package Pages;

import org.global.Globallibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Globallibrary{

	public LoginPage()
	 {
	      PageFactory.initElements(driver, this);
	 }
	 
	@FindBy(name="username")
	private WebElement txtUserName;
	
	@FindBys({@FindBy(name="password"),@FindBy(id="password")})
	private WebElement txtPwd;
			
	
	   
}
