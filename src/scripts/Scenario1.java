package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub''
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		//ctrl+shift+o
		
		driver.get("http://www.bing.com");
		
		//find an object inthe browser with id='sb_form_q'
		
		driver.findElement(By.id("sb_form_q")).sendKeys("day");
		driver.findElement(By.id("sb_form_q")).clear();
		
		
		driver.findElement(By.className("b_searchbox")).sendKeys("ramya");
		driver.findElement(By.id("sb_form_q")).clear();
		
		
		driver.findElement(By.name("q")).sendKeys("surendra Jaganadam");
		
		driver.findElement(By.id("sb_form_go")).click();
		//is performing a click operation on a button
		
		//driver.close(); //which will close the browser instance: 
		
		/*
		 * 5 browsers: on which browser your webdriver execution is it will close that browser only
		 *  4 opened
		 * 
		 */
		
		Thread.sleep(3500);
		
		driver.quit(); //close the browser instance
		
		//5 : closed

	}

}
