package saucedemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseBase {
	
	WebDriver driver;
	
	public void setup() {
		
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	public void teardown() {
		
		driver.close();
	}

}
