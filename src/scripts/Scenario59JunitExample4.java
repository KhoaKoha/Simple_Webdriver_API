package scripts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Scenario59JunitExample4 {
	
	@Test //this test just like a main method 
	public void test() throws Exception{
		
	ATUTestRecorder record= new ATUTestRecorder("C:\\Users\\Srujan\\Documents\\IDE Scripts","Daya",true);
		
		record.start(); //start the recoidng
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		driver.findElement(By.id("adlt_set_strict")).click();
		Thread.sleep(2500);
		
		
		driver.findElement(By.id("adlt_set_moderate")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("adlt_set_off")).click();
		Thread.sleep(2500);
		
		
		driver.quit();
		
		record.stop(); //stop the reocrindg

		
	}
	
//we can create a java class, to which we need to add either junit or testgn "test annotation" then automatically java class will coverted into eiher junt r testng
	
	
	
	
}


/*
 * created a new java class
 * added test annotation
 * whatever the content we have in main method for a java clas i copied the same and pasetd inside the main method
 */

