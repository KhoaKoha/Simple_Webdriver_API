package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario11Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		driver.get("https://jqueryui.com/draggable/");
		
		//id, name
		
		//driver.switchTo().frame("demo-frame");
		
		WebElement fr=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		WebElement dd=driver.findElement(By.id("draggable"));
		
		driver.switchTo().defaultContent();
		//which will switch to parent html page
		
		
		driver.quit();
		
	}

}
