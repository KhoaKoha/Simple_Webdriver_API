package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Scenario44FFProfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni prf= new ProfilesIni();
		
		FirefoxProfile fp=prf.getProfile("SeleniumUser");
System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver(fp);
		

	}

}
