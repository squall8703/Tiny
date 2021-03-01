package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
final WebDriver driver;
	
	public DashboardPage(WebDriver driver){
			this.driver=driver;
		}
		
	//Locating the User and Setting link
	@FindBy(xpath="//a[@aria-label='Users and Settings']")
	WebElement lnkUserSetting;
	
	//Function used for clicking the User Setting menu link
	public void ClickUserSettingMenu(){	
		lnkUserSetting.click();
	}
}
