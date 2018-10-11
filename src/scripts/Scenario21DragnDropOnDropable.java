package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario21DragnDropOnDropable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//ctrl+shift+o
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		//id, name
		
		//driver.switchTo().frame("demo-frame");
		
		WebElement fr=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement dest=driver.findElement(By.id("droppable"));
		
		
		Actions a= new Actions(driver);
		
		a.dragAndDrop(source, dest).build().perform();
		
		Thread.sleep(6500);
		
		driver.quit();
		
		

	}

}
