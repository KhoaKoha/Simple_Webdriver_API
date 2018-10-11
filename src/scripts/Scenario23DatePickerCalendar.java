package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario23DatePickerCalendar {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//ctrl+shift+o
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		//id, name
		
		//driver.switchTo().frame("demo-frame");
		
		WebElement fr=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(fr);
		
		driver.findElement(By.id("datepicker")).click(); //which will clicki on the text field which will open the calendar
		
		//below cmd will click on next button
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
		
		driver.findElement(By.linkText("24")).click();
		

		Thread.sleep(6500);
		
		driver.quit();
		
		
	}

}
