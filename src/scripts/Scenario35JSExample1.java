package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario35JSExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//open the application using java script executor

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.location='http://www.amazon.in'");
		
		//js.executeScript("");
		
		
		Thread.sleep(3500);
		driver.quit();
		
		
	}

}
