package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserPage {
	
final WebDriver driver;
	
	public UserPage(WebDriver driver){
			this.driver=driver;
		}
		
	//Locating the link Add People
	@FindBy(xpath="//a[@href='/invite']")
	WebElement lnkAddPeople;
	
	//Locating the 1st textbox First Name 
	@FindBy(xpath="//input[@field='firstName'][@refkey=1]")
	WebElement txtfirstName1;
	
	//Locating the 1st textbox Last Name 
	@FindBy(xpath="//input[@field='lastName'][@refkey=1]")
	WebElement txtlastName1;
	
	//Locating the 1st textbox Email 
	@FindBy(xpath="//input[@field='email'][@refkey=1]")
	WebElement txtemail1;
	
	//Locating the button to confirm Add People
	@FindBy(xpath="//span[text()[contains(.,'Add People')]]")
	WebElement btnAddPeople;
	
	//Locating the message Congratulation after Add people successfully 
	@FindBy(xpath="//div[text()[contains(.,'Congratulations')]]")
	WebElement mssCongratulation;
	
	//Function used to click Add People 
	public void ClickAddPeople(){	
		lnkAddPeople.click();
	}
	
	//Function used for Add people with param: firstname, lastname and email. Then click button Add People
	public void AddPeople(String firstName, String lastName, String email) {
		txtfirstName1.sendKeys(firstName);
		txtlastName1.sendKeys(lastName);
		txtemail1.sendKeys(email);
		btnAddPeople.click();
	}
	
	//Function used for checking the message Congratulation is displayed after adding people finish
	public void CheckCongratulation() {
		Assert.assertEquals(true, mssCongratulation.isDisplayed());
	}
}
