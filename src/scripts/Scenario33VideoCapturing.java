package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;

public class Scenario33VideoCapturing {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * 1st parameter: file name
		 * 2nd paramter: file lovation
		 * 3rd parmter true: audio n video or false: video only
		 */
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

}
