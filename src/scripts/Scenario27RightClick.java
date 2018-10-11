package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario27RightClick {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.bing.com");
		
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		
		WebElement dd= driver.findElement(By.id("sb_form_go"));
		//right click operation
		//build: there are multiple actions it will build into a sing;e acton n then when we ave perform it will perform that operation
		a.contextClick(dd).perform();
		
		Thread.sleep(6500);
		
		driver.quit();
		

		
	}

}
