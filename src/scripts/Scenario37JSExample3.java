package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario37JSExample3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//open the application using java script executor

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.location='http://www.bing.com'");
		

		String title1=js.executeScript("return document.title").toString();
		
		js.executeScript("document.getElementById('sb_form_q').value='Surendra'");
		
		js.executeScript("document.getElementById('sb_form_go').click();");
		String title2=js.executeScript("return document.title").toString();

		
		System.out.println("title1 is : " +title1);
		System.out.println("title2 is : " +title2);
		
		Thread.sleep(3500);
		driver.quit();
		
		
	}

}
