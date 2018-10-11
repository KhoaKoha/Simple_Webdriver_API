package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario26MouseHover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.emirates.com/in/english/");
		
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		
		Thread.sleep(9800);
		
		WebElement d=driver.findElement(By.xpath("//li[@id='gnav-manage']/a"));
		
		//build, : perform command
		a.moveToElement(d).perform();
		
		Thread.sleep(3800);
		
		driver.findElement(By.linkText("Purchase an upgrade")).click();
		
		Thread.sleep(6500);
		
		driver.quit();
		
		
		
	}

}
