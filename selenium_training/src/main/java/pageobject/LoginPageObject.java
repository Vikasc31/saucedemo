package pageobject;
import org.openqa.selenium.By;

public class LoginPageObject {
	
	public static By Username = By.xpath("//input[@id = 'user-name']");
	public static By Password = By.xpath("//input[@id = 'password']");
	public static By Login = By.xpath("//input[@id = 'login-button']");
	public static By error = By.xpath("//form/div[3]");
}
