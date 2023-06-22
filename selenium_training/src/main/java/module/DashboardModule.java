package module;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobject.DashboardPageObject;

public class DashboardModule {

	
	public static boolean verifyProduct(WebDriver driver) {
		
	return driver.findElement(DashboardPageObject.Product).isDisplayed();
	}
	public static void verifySort(WebDriver driver) {
		
	driver.findElement(DashboardPageObject.sortContainer).click();
	}
	public static void verifyPriceFilter(WebDriver driver) {
		
	driver.findElement(DashboardPageObject.priceFilter).click();

	}
	public static void verifyItem1(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.item1).click();

		}
	public static void verifyItem2(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.item2).click();

		}
	public static void verifyCartCount(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.cartCount);

		}
	public static void verifyCart(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.cart).click();

		}
	public static void verifyCartItem(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.cartitem).click();

		}
	public static void verifyCheckout(WebDriver driver) {
		
		driver.findElement(DashboardPageObject.checkout).click();

		}
	public static void verifyFirstName(WebDriver driver) {
	
	driver.findElement(DashboardPageObject.firstName).sendKeys("Vikas");

	}
	public static void verifyLastName(WebDriver driver) {
	
	driver.findElement(DashboardPageObject.lastName).sendKeys("Chavan");

	}
	public static void verifyPostalCode(WebDriver driver) {
	
	driver.findElement(DashboardPageObject.postalCode).sendKeys("412207");

	}
	public static void verifyContinue(WebDriver driver) {
	
	driver.findElement(DashboardPageObject.continuebutton).click();

	}
	public static void verifyFinish(WebDriver driver) {
	
	driver.findElement(DashboardPageObject.finish).click();

	}
	
}
