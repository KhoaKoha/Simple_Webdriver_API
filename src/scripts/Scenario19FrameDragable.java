package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario19FrameDragable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//ctrl+shift+o
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		
		//id, name
		
		//driver.switchTo().frame("demo-frame");
		
		WebElement fr=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		WebElement dd=driver.findElement(By.id("draggable"));
		
		//driver.switchTo().defaultContent();
		//which will switch to parent html page
		
		Actions a= new Actions(driver);
		Thread.sleep(2500);
		/*
		a.dragAndDrop(source, target): if we know from where to move n where to drop then we use this
		a.dragAndDropBy(source, xOffset, yOffset): if we know wat we  need to drag but dont know where we need to drop then we will use x and y coordinates
		
		*/
		
		a.dragAndDropBy(dd, 150, 150).build().perform();
		
		Thread.sleep(6500);
		
		driver.quit();
		
	}

}
