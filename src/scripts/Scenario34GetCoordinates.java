package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;

public class Scenario34GetCoordinates {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		driver.findElement(By.id("adlt_set_strict")).click();
		String val1=driver.findElement(By.id("adlt_set_strict")).getAttribute("value");
		System.out.println("valye proptery for an onject s:" +val1);
		Thread.sleep(2500);
		
		Point p=driver.findElement(By.id("adlt_set_strict")).getLocation(); //we can get x and y cooridates of an obect
		
		int x=p.getX();
		int y=p.getY();
		
		System.out.println("x cordinate is : " +x);
		System.out.println("y cordinate is : " +y);
		
		Dimension d=driver.findElement(By.id("adlt_set_strict")).getSize();// height n width of the obect
		
		int h=d.getHeight();
		int w=d.getWidth();
		
		System.out.println("height of th eobject is :" +h); 
		System.out.println("widht of the object us: " +w);
		driver.quit();
		
		
		//getAttribute: using this we can capture any property value for an object
		
	}

}
