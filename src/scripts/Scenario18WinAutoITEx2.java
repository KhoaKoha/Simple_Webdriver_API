package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario18WinAutoITEx2 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("file:///C:/Users/Srujan/Desktop/WinAlerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("photo")).click();
		
		//3 parameters: 1st exe location, 2nd desired file location if u havent specified in autoit program, 3rd always open command
	
		//new ProcessBuilder("C:\\Users\\Srujan\\Documents\\AutoIT Examples\\Rekha1.exe","","Open").start();
		
		Runtime.getRuntime().exec("C:\\Users\\Srujan\\Documents\\AutoIT Examples\\Rekha1.exe");
		
		Thread.sleep(6000);
		driver.quit();
		
	}

}
