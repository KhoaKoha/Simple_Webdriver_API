package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario31WebTableSF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/default.asp");
		
		driver.manage().window().maximize();
		
		
		//till navigating to that object page u need to write down the logic
		
		//the below logic will identify the table as table is having a value which is from the url hence from the url i copied the id values
		//from then i heneretad xpath using stringbuilder concept
		
		String url=driver.getCurrentUrl();
		//url: https://ap7.salesforce.com/01I0I000002NKyB?setupid=CustomObjects
		//subString method
		
		String id=url.substring(27, 42);
		
		//div[@id='01I0I000002NKyB_CustomFieldRelatedList_body']/table/tbody
		String before="//div[@id='";
		String after="_CustomFieldRelatedList_body']/table/tbody";
		
		String xp1= new StringBuilder().append(before).append(id).append(after).toString();
		
		WebElement table=driver.findElement(By.xpath(xp1));

	}

}
