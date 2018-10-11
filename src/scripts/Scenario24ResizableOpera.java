package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario24ResizableOpera {
	
	// TODO Auto-generated method stub
	
	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	//ctrl+shift+o
	
	driver.get("https://jqueryui.com/resizable/");
	
	driver.manage().window().maximize();
	
	//id, name
	
	//driver.switchTo().frame("demo-frame");
	
	WebElement fr=driver.findElement(By.className("demo-frame"));
	
	driver.switchTo().frame(fr);
	
	WebElement source= driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	
	Actions a= new Actions(driver);
	
	Thread.sleep(2500);
	
	a.dragAndDropBy(source, 550, 250).build().perform();
	

	Thread.sleep(6500);
	
	driver.quit();
			
			
			
	
}

}
