package scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Scenario43CookiesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.bing.com");
		
		Set<Cookie> cok=driver.manage().getCookies();
		
		Iterator<Cookie> iter=cok.iterator();
		
		/*
		iter.hasNext(): which will verify whether there is a next value in the set
		iter.next(): which will get the information*/
		
		//rotate this loop fif(iteror all the values in the set
		for(int i=0;i<cok.size();i++){
			
			
			if(iter.hasNext()){
				
				Cookie c=iter.next();
				
				System.out.println(c.getDomain());
				System.out.println(c.getName());
				System.out.println(c.getPath());
				System.out.println(c.getValue());
				System.out.println(c.getClass());
				System.out.println(c.getExpiry());
				System.out.println("********************************************");
				
				
			}
			
			
		}
		
driver.quit();
	}

}
