package module;

import org.openqa.selenium.WebDriver;
import pageobject.LoginPageObject;

public class LoginModule {
	
	WebDriver driver;
	public LoginModule(WebDriver driver) {
		
		this.driver = driver;
	}

	public void enterUserName(String username) {
		
		driver.findElement(LoginPageObject.Username).sendKeys(username);
	}
	public void enterUserPassword(String password) {
		
		driver.findElement(LoginPageObject.Password).sendKeys(password);
	}	
	public void clickLogin() {
		
		driver.findElement(LoginPageObject.Login).click();
	}	
	public static void enterUserName(WebDriver driver,String username) {
		
		driver.findElement(LoginPageObject.Username).sendKeys(username);

	}
	public static void enterUserPassword(WebDriver driver, String password) {
		
		driver.findElement(LoginPageObject.Password).sendKeys(password);
	}	
	public static void clickLogin(WebDriver driver) {
		
		driver.findElement(LoginPageObject.Login).click();
	}	
	public static void login(WebDriver driver, String username, String password) {
		
		enterUserName(driver,username);
		enterUserPassword(driver,password);
		clickLogin(driver);
	}
	public void login(String username, String password) {
		
		enterUserName(driver,username);
		enterUserPassword(driver,password);
		clickLogin(driver);
	}
	public static boolean verifyUserNameTextbox(WebDriver driver) {
		
		return driver.findElement(LoginPageObject.Username).isDisplayed();
	}
	public static boolean verifyPasswordTextbox(WebDriver driver) {
		
		return driver.findElement(LoginPageObject.Password).isDisplayed();
	}
	public boolean verifyUserNameTextbox() {
		
		return driver.findElement(LoginPageObject.Username).isDisplayed();
	}
	public boolean verifyPasswordTextbox() {
		
		return driver.findElement(LoginPageObject.Password).isDisplayed();
	}
	public static boolean verifyError(WebDriver driver) {
		
		return driver.findElement(LoginPageObject.error).isDisplayed();	
	}
}
