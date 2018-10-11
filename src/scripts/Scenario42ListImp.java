package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Scenario42ListImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scenario41ListMethods obj= new Scenario41ListMethods();

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver1= new ChromeDriver();
		
		EventFiringWebDriver driver=new EventFiringWebDriver(driver1);
		
		driver.register(obj);//it will recognize the methods listed down in the notes, it wont recognize the methods what we have written
		
		driver.get("http://www.bing.com");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("ramua");
		
		driver.findElement(By.id("sb_form_go")).click();
		
		driver.quit();
		
		
	}

}
