package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario14FFWinPopUps {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		
		driver.get("file:///C:/Users/Srujan/Desktop/WinAlerts.html");
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Srujan\\Downloads\\S2.png");
		
		//20-30% of cases only this sendkeys will work
		
		Thread.sleep(4500);
		
		driver.quit();

	}

}
