package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import pages.DashboardPage;
import pages.UserPage;
import java.util.Random;


public class TestScenario {
	
	static WebDriver driver; 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Random rand = new Random();
		
		//Step 1: Go to Login page and sign in with account which has been created 
		driver.get("https://staging.tinyserver.info/signin");
		LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
		loginPg.LogIn_Action("nghi02@mailinator.com", "Ab12345@");
		
		//Step 2: click User and Settting menu at Dashboard 
		DashboardPage dashboardPg = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPg.ClickUserSettingMenu();
		
		//Step 3:click Add people menu, enter information of people then click Add people button (use random email)
		UserPage userPg = PageFactory.initElements(driver, UserPage.class);
		userPg.ClickAddPeople();
		userPg.AddPeople("F1", "L1", "Nghi"+rand.nextInt(10000)+"@email.com");
		
		//Step 4: check message Congratulation
		userPg.CheckCongratulation();
		
		driver.quit();		
	}
}
