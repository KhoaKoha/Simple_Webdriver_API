package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario36JSExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//open the application using java script executor

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.location='http://www.bing.com'");
		
		//js.executeScript(""); id=sb_form_q, id=sb_form_go
		
		//js.executeScript("document.getElementById('gh-ac').value='LG'");
		
		js.executeScript("document.getElementById('sb_form_q').value='Surendra'");
		
		js.executeScript("document.getElementById('sb_form_go').click();");
		
		Thread.sleep(3500);
		driver.quit();
		
		
	}

}
