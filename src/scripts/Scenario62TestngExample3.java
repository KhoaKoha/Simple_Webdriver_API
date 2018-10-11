package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scenario62TestngExample3 {
	
	
	@Test
	public void f() throws Exception {	
		
	System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
			driver.findElement(By.id("setlang")).sendKeys("dansk");
	
	
	
		Thread.sleep(8500);
		driver.quit();
		
		
	}

}
