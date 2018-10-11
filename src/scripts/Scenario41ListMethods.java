package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class Scenario41ListMethods extends AbstractWebDriverEventListener{
	
	//this is a webdriver listente
	public void afterClickOn(WebElement element, WebDriver driver){
		System.out.println("this after click on code");
	}
	
//my own listener
	
	public void beforeClick(){
		System.out.println("this is our own code");
	}

}
