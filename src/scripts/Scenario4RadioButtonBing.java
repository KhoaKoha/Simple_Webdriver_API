package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario4RadioButtonBing {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		driver.findElement(By.id("adlt_set_strict")).click();
		Thread.sleep(2500);
		
		
		driver.findElement(By.id("adlt_set_moderate")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("adlt_set_off")).click();
		Thread.sleep(2500);
		driver.quit();
		
		
	}

}
