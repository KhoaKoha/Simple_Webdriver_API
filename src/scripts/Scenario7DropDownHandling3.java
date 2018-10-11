package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario7DropDownHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		WebElement dd=driver.findElement(By.id("setlang"));
			//	vtrl+shift+o
		//sneed to pass dd info as an arg
		Select s= new Select(dd);
		
		//total valyes as 50
		List<WebElement> val=s.getOptions();
		
		System.out.println("total values in the dropdown are:" +val.size());
		
		//i++ ==i= i+1, i+2,i+3
		for(int i=0;i<val.size();i++){
			
			//get(i): it will select specified i value from the list of values in val collection
			//getText(): will get the text from the specified object
			String x=val.get(i).getText();
			System.out.println("values are; " +x);
			
		}
		
		driver.quit();
		
		
		
		
	}

}
