package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ScenarioIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();

	}

}
