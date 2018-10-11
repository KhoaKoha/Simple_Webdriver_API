package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//scemnario: enter uname, without entering pswd handle the alert in the same way

public class Scenario13SimpleAlerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.services.irctc.co.in");

		driver.manage().window().maximize();
		
		Thread.sleep(3500);
		
		driver.findElement(By.name("button")).click();
		
		Alert a=driver.switchTo().alert();
		
		String x=a.getText(); //which will get teh text from the alerts
		
		a.accept(); //this will click on ok button on any alert
		
		//a.dismiss();//this will click on cancel button on the alert
		
		System.out.println("text present on the alert is: " +x);
		
		driver.quit();
		
	}

}
