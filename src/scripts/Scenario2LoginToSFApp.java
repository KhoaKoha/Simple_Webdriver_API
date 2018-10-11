package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario2LoginToSFApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("kandukuri.murthy1@gmail.com");
		
		driver.findElement(By.name("pw")).clear();
		driver.findElement(By.name("pw")).sendKeys("Q@test12");
		//login button or i can press enter in my pswd field
		
		driver.findElement(By.name("Login")).click();
		
		
		//driver.close(); //will close on the browser on which the execution is going on
		driver.quit(); //will close all the browser instances
		

	}

}
