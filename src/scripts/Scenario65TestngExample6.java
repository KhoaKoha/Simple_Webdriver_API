package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Scenario65TestngExample6 {

	
	@Test(dependsOnMethods={"login"})
	public void createUser() {
		System.out.println("ceate");
	
	}
	
	@Test(dependsOnMethods={"createUser"})
	public void editUser() {
		System.out.println("edit");
	
	}
	
	@Test(dependsOnMethods={"editUser"})
	public void logout() {
		System.out.println("logout");
	
	}
	
	
	@Test
	public void login() {
		System.out.println("login");
	
	}

}
