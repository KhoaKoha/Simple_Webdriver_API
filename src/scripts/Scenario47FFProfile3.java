package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Scenario47FFProfile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile fp = new FirefoxProfile();
		//these 2 commands wont display any kinf of certificate popup on the browser
		  fp.setAcceptUntrustedCertificates(true); 
		   fp.setAssumeUntrustedCertificateIssuer(false);
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver(fp);
		

	}

}
