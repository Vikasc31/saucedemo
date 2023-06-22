package saucedemo;

public class LoginTest extends Saucedemo {
	
	public static void main(String[] args) throws InterruptedException {

		LoginTest login = new LoginTest();
		login.verify_login_page_visibility();
		login.verify_successful_login();
		login.verify_unsuccessful_login();
		login.verify_homepage();
		login.verify_sorting();
		login.verify_adding_item();
		login.verify_removing_item();
		login.verify_successful_checkout();
		login.verify_logout_functionality();
	}

}
