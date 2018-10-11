package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Scenario68TestngExample9 {
	
	
	//paramgter annptaion here
//. so that we can pass ans if condition which can work on 3 browser which i am going to define in before suite
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"uid"})
	public void before(String uid){
		
		if(uid.equalsIgnoreCase("firefox")){
			//system.setPropert();
			driver= new FirefoxDriver();
		}else if(uid.equalsIgnoreCase("chrome")){
			//system.setPropert();			
			driver= new ChromeDriver();
		}
	}
	

	@Test
	public void test(){
		driver.get("http://www.bing.com");
	}

	
}
