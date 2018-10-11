package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario22DatePickerSendKeys {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//ctrl+shift+o
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		//id, name
		
		//driver.switchTo().frame("demo-frame");
		
		WebElement fr=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		driver.findElement(By.id("datepicker")).sendKeys("12/25/2017");
		

		Thread.sleep(6500);
		
		driver.quit();
		
		
	}

}
