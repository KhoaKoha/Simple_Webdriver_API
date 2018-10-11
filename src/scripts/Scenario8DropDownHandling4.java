package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario8DropDownHandling4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		WebElement dd=driver.findElement(By.id("setlang"));
		
		//driver.findELements: it will try to indeitfy all the objects from the entire browser, 55
		
	List<WebElement> val1=	driver.findElements(By.tagName("option"));
	
	System.out.println("total values in the dropdown are:" +val1.size());
	
	//i need values from dropdown
	List<WebElement> val=dd.findElements(By.tagName("option"));
	System.out.println("total no values in the complete dropdown are: " +val.size());
	
	
	
	driver.quit();
		
		
		
	}

}
