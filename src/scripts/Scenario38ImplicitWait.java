package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;

public class Scenario38ImplicitWait {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		//wait for 30secs: this is a global wait for all the below cmd it will wait for 30secs if the object was not dsplayed in the browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.id("adlt_set_strict")).click();
		Thread.sleep(2500);
		
		
		driver.findElement(By.id("adlt_set_moderate")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("adlt_set_off")).click();
		Thread.sleep(2500);
		
		
		driver.quit();
		
	}

}
