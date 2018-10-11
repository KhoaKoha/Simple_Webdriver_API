package scripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario32ScreenShotCapturing {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		driver.findElement(By.id("adlt_set_strict")).click();
		Thread.sleep(2500);
		
		
		driver.findElement(By.id("adlt_set_moderate")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("adlt_set_off")).click();
		Thread.sleep(2500);
		
		//convert webdriver interface to takescreen interface
		
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//store screenshot at a specidfied location
				FileUtils.copyFile(scrFile, new File("C:\\Users\\Srujan\\Documents\\IDE Scripts\\ramya.png"));
		
		
		driver.quit();
		
		
	}

}
