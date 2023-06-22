package saucedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import module.DashboardModule;
import module.LoginModule;

public class Saucedemo extends TestCaseBase {
	@Test
	public void verify_successful_login() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
				
		lg.login("standard_user", "secret_sauce");
		
		boolean isDisplayed = DashboardModule.verifyProduct(driver);
		if(isDisplayed) {
			
			System.out.println("Login Successful");
		}else {
			
			System.out.println("Login unsuccessful");
		}
		teardown();
	}
	@Test
	public void verify_unsuccessful_login() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
				
		lg.login("standard_user123", "secret_sauce");
		
		boolean isDisplayed = LoginModule.verifyError(driver);
		if(isDisplayed) {
			
			System.out.println("Login unsuccessful");
		}else {
			
			System.out.println("Login Successful");
		}
		teardown();
	}
	
	@Test
	public void verify_login_page_visibility() {
		
		setup();
		
		boolean udisplay = LoginModule.verifyUserNameTextbox(driver);
		boolean pdisplay = LoginModule.verifyPasswordTextbox(driver);
				
		if(udisplay && pdisplay) {
			
			System.out.println("Login page is visible");
		}else {
			
			System.out.println("Login page is not visible");
		}
		teardown();
	}
	@Test
	
	public void verify_homepage() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
		
		lg.login("standard_user", "secret_sauce");
		
		boolean homapage = DashboardModule.verifyProduct(driver);
		
		if(homapage) {
			
			System.out.println("Home page is visible");
		}else {
			
			System.out.println("Home page is not visible");
		}
		teardown();
		
	}
	@Test
	public void verify_sorting() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
		
		lg.login("standard_user", "secret_sauce");
		
		List<WebElement>beforeFilter = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		List<Double>beforeFilterList = new ArrayList<>();
		
		for(WebElement p : beforeFilter) {
			
			beforeFilterList.add(Double.valueOf(p.getText().replace("$", "")));
			
		}
		Select dropdown = new Select(driver.findElement(By.xpath("//span/select[@class='product_sort_container']")));
		dropdown.selectByVisibleText("Price (low to high)");
		
		List<WebElement>afterFilter = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	
		List<Double>afterFilterList = new ArrayList<>();
		
		for(WebElement p : afterFilter) {
			
			afterFilterList.add(Double.valueOf(p.getText().replace("$", "")));
							
		}
		if(beforeFilterList == afterFilterList) {
			
			System.out.println("Sorting is incorrect");
		}else {
			
			System.out.println("Sorting is correct");
		}
		teardown();
	} 
	@Test
	public void verify_adding_item() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
		
		lg.login("standard_user", "secret_sauce");
		
		DashboardModule.verifyItem1(driver);
		DashboardModule.verifyItem2(driver);
		
		WebElement cartcount = driver.findElement(By.xpath("//a[@class='shopping_cart_link']/span"));
		
		String actualCountText = cartcount.getText();
		
		int actualCount = Integer.parseInt(actualCountText);
		
		int expectedCount = 2;
		
		if(actualCount == expectedCount) {
			
			System.out.println("Added cart item count is correct");
		}else {
			
			System.out.println("Added cart item count is incorrect");
		}
		teardown();
	}
	@Test
		public void verify_removing_item() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
		
		lg.login("standard_user", "secret_sauce");
		
		DashboardModule.verifyItem1(driver);
		DashboardModule.verifyItem2(driver);
		DashboardModule.verifyCart(driver);
		
		DashboardModule.verifyCartItem(driver);
		DashboardModule.verifyCartItem(driver);

		boolean cartCount = driver.findElement(By.xpath("//a[@class='shopping_cart_link']/span]")).isEnabled();
				
		if(cartCount) {
			
			System.out.println("Cart empty successfully");
		}else {
			
			System.out.println("Cart empty Unsuccessfully");
		}
		teardown();
	}
	@Test
	public void verify_successful_checkout() {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
		
		lg.login("standard_user", "secret_sauce");
		
		DashboardModule.verifyItem1(driver);
		DashboardModule.verifyItem2(driver);
		DashboardModule.verifyCart(driver);
		
		DashboardModule.verifyCheckout(driver);
		DashboardModule.verifyFirstName(driver);
		DashboardModule.verifyLastName(driver);
		DashboardModule.verifyPostalCode(driver);
		DashboardModule.verifyContinue(driver);
		DashboardModule.verifyFinish(driver);
				
		boolean completed = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).isDisplayed();
		
		if(completed) {
			
			System.out.println("Order placed successful");
		}else {
			
			System.out.println("Order placed failed");
		}
		teardown();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void verify_logout_functionality() throws InterruptedException {
		
		setup();
		
		LoginModule lg = new LoginModule(driver);
		
		lg.login("standard_user", "secret_sauce");
		
		WebElement brMenu = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
		
		brMenu.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement menuItem =brMenu.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
		
		menuItem.click();

		teardown();
		
		
	}
}
