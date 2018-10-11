package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario3Checkbox {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//ctrl+shift+o
		
		driver.get("https://www.bing.com/account/general?ru=");
		
		driver.findElement(By.id("enAS")).click();
		//by default it is checked, but above cmd will uncheck it hence if condition will fail and it il enter to else block n it iwll uodate the box 
		
		WebElement obj=driver.findElement(By.id("enAS"));
		//ctrl+shift+O

		//both r one and the same		
		boolean x=obj.isSelected();//driver.findElement(By.id("enAS"));.isSelected();
		//.isSelected(); checkbox r radio button : the status and it will reutrn true when it is in checked mode, false: unchecked mode
		if(x){
			
			System.out.println("checkbox is already in check mode u no need to perform any operations on that");
		}else{
		
			driver.findElement(By.id("enAS")).click();//to toggle the status of checkbox
			System.out.println("updated checkbox status");
		}
		
		
		
		//radio buttons, checkboxes, imagaes ,buttons n links
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
	}
}
