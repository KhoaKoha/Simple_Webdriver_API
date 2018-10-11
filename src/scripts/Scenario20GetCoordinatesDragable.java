package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario20GetCoordinatesDragable {

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
		
		Point p=dd.getLocation(); //we can get current  x and y cooridanates of the object
		Dimension d=dd.getSize(); //we can get height and widht of that objects
		
		int x=p.getX(); //x cori of the draganle
		int y=p.getY(); //y cordinate if the dragable object
		
		System.out.println("x value is: " +x);
		System.out.println("y value is: " +y);
		
		//i would lile to move my desired object to x+100, y+100: 108
		
		
		d.getHeight();
		d.getWidth();
		//driver.switchTo().defaultContent();
		//which will switch to parent html page
		
		Actions a= new Actions(driver);
		Thread.sleep(2500);
		/*
		a.dragAndDrop(source, target): if we know from where to move n where to drop then we use this
		a.dragAndDropBy(source, xOffset, yOffset): if we know wat we  need to drag but dont know where we need to drop then we will use x and y coordinates
		
		*/
		
		a.dragAndDropBy(dd, x+100, y+100).build().perform();
		
		//directly u can specifiy x n y as a random values r we can also capture the current coordnates of the object n then we can ask our program to increment them
		
		Thread.sleep(6500);
		
		driver.quit();
		
	}
}
