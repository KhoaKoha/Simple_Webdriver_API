package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario6DropDownHandling2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		WebElement dd=driver.findElement(By.id("setlang"));
			//	vtrl+shift+o
		//sneed to pass dd info as an arg
		Select s= new Select(dd);
		
		s.selectByIndex(2);
		Thread.sleep(2500);
		
		s.selectByValue("hi-IN");
		Thread.sleep(2500);
		
		s.selectByVisibleText("English");
		Thread.sleep(3500);
		driver.quit();
	}

}
