package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Scenario64TestngExample5 {

	
	@Test(priority = 2)
	public void createUser() {
		System.out.println("ceate");
	
	}
	
	@Test(priority = 3)
	public void editUser() {
		System.out.println("edit");
	
	}
	
	@Test(priority = 1, enabled=false)
	public void logout() {
		System.out.println("logout");
	
	}
	
	
	@Test(priority = 4)
	public void login() {
		System.out.println("login");
	
	}

}
