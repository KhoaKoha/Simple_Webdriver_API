package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario29WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub : get 1st row values from the 1st column
		
		//identified the table so that from the table we can capture totall no of rows thas what we did here..
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/default.asp");
		
		driver.manage().window().maximize();
		
		
		WebElement table=driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody"));
		
		List<WebElement> values=driver.findElements(By.tagName("tr"));
		
		System.out.println("total no of rows in the table ar: " +values.size());
		
		//tr[3]/td/a
		
		String before="//tr[";
		String after="]/td/a";
		
		for(int i=2;i<values.size();i++){
			
			//before+i+after
			
			String xp1=new StringBuilder().append(before).append(i).append(after).toString();
			
		//	System.out.println(xp1);
			
			
			String val=driver.findElement(By.xpath(xp1)).getText();
			System.out.println(val);
		}
		
		
driver.quit();
	}

}
