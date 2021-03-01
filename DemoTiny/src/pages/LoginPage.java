package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	final WebDriver driver;
	
	public LoginPage(WebDriver driver){
			this.driver=driver;
		}
		
	//Locating the username text box
	@FindBy(xpath="//input[@data-cucumber='input-login-email']")
	WebElement txtUsername;
	
	//Locating the password text box
	@FindBy(xpath="//input[@data-cucumber='input-login-password']")
	WebElement txtPassword;
	
	//Locating the button Continue 
	@FindBy(xpath="//div[@data-cucumber='button-continue']")
	WebElement btnContinue;
	
	//Locating button Login
	@FindBy(xpath="//div[@data-cucumber='button-login']")
	WebElement btnLogin;
	
	//Function used for Login. Enter the username, password then click button Login
	public void LogIn_Action(String username, String password){
		txtUsername.sendKeys(username);
		btnContinue.click();
		txtPassword.sendKeys(password);
		btnLogin.click();
	}

}
