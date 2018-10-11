package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Scenario46FFProfile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile fp = new FirefoxProfile();
		
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv,application/x-msexcel,application/x-excel,application/vnd.ms/excel," +
				"image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		  
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "D:\\WebDriverdownloads");
		
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver(fp);
		
	}

}
