package scripts;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Scenario45DesCapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub: u can replace ghis chrome with fiefox too
		
		Proxy p= new Proxy();
		
		p.setProxyAutoconfigUrl("http://freeproxyserver.net/");
		 
		DesiredCapabilities dc= new DesiredCapabilities();
		
		dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		dc.setCapability(CapabilityType.PROXY, p);
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(dc);
		
		driver.get("http://www.bing.com");
		
		
		
		
	}

}
