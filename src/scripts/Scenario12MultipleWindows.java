package scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario12MultipleWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("kandukuri.murthy1@gmail.com");
		
		driver.findElement(By.name("pw")).clear();
		driver.findElement(By.name("pw")).sendKeys("Q@test12");
		//login button or i can press enter in my pswd field
		
		driver.findElement(By.name("Login")).click();
		Thread.sleep(22500);
		
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(4500);
		driver.findElement(By.name("new")).click();
		Thread.sleep(4500);
		
		driver.findElement(By.id("acc2")).sendKeys("Surendra Jaganadam");
		driver.findElement(By.className("lookupIcon")).click();
		//lets stop the script for sometime  so that all the objecst on the page will load
		Thread.sleep(6500);
		
		String fi=driver.getWindowHandle();
		//it will get current window information
		
		Set<String> val=driver.getWindowHandles();
		//it will capture all the windows infomration: collection of multiple valeus multiple windows info and each nvery is a string
		//list n set: to indeitfy total no of values we use .size(): 
		
		System.out.println("total no of windows are:" +val.size());
		
		Iterator<String> iter=val.iterator();
		
		String first=iter.next(); //will captues 1st values from the set and it stored in first varaible whih is of string type
		String second=iter.next(); //will caotures 2nd value from the set and  it stroed in second variable which is of string data type
		
		/*
		for(int i=0;i<30;i++){
			
			String first1=iter.next();
		}
		*/
		
		
		driver.switchTo().window(second);
		
		//WebElement fr1= driver.findElement(By.name("searchFrame"));

		Thread.sleep(4500);	
		//name property we need to pass in
		driver.switchTo().frame("searchFrame");
		
		//this object is on new window 
		driver.findElement(By.id("lksrch")).sendKeys("ramya");
		
		
		//i need to switch back to my 1st window then
		
		driver.switchTo().window(first); //driver.switchTo().defaultContent();
		
		Thread.sleep(4500);
		driver.quit();
	}

}
