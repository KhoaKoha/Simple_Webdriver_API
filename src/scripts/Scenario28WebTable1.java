package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario28WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub : get 1st row values from the 1st column
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/default.asp");
		
		driver.manage().window().maximize();
		
		//tr[3]/td/a
		
		String before="//tr[";
		String after="]/td/a";
		
		for(int i=2;i<=4;i++){
			
			//before+i+after
			
			String xp1=new StringBuilder().append(before).append(i).append(after).toString();
			
		//	System.out.println(xp1);
			
			
			String val=driver.findElement(By.xpath(xp1)).getText();
			System.out.println(val);
		}
		
		
driver.quit();
	}

}
