package pageobject;
import org.openqa.selenium.By;

public class DashboardPageObject {
	
	public static By Product = By.xpath("//span[text()='Products']");
	public static By sortContainer = By.xpath("//span/select[@class='product_sort_container']");
	public static By priceFilter = By.xpath("//div[@class='inventory_item_price']"); 
	public static By item1 = By.xpath("//div[@class='inventory_list']/div[1]//button"); 
	public static By item2 = By.xpath("//div[@class='inventory_list']/div[2]//button"); 
	public static By cartCount = By.xpath("//a[@class='shopping_cart_link']/span"); 
	public static By cart = By.xpath("//a[@class='shopping_cart_link']"); 
	public static By cartitem = By.xpath("//div[@class='cart_list']/div[@class='cart_item'][1]//button");
	public static By checkout = By.xpath("//div[@id='cart_contents_container']/div/div[@class='cart_footer']/button[@id='checkout']");
	public static By firstName = By.xpath("//div[@class='checkout_info']//input[@id='first-name']");
	public static By lastName = By.xpath("//div[@class='checkout_info']//input[@id='last-name']");
	public static By postalCode = By.xpath("//div[@class='checkout_info']//input[@id='postal-code']");
	public static By continuebutton = By.xpath("//div[@class='checkout_buttons']//input[@id='continue']");
	public static By finish = By.xpath("//div[@class='cart_footer']//button[@id='finish']");
	
}
