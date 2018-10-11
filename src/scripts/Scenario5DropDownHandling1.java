package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5DropDownHandling1 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
			driver.findElement(By.id("setlang")).sendKeys("dansk");
	
	
	
		Thread.sleep(8500);
	//	driver.quit();
	}

}
