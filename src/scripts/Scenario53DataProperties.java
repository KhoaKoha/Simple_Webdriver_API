package scripts;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario53DataProperties {
	
	public static void main(String[] args) throws Exception {
		
		Properties pr= new Properties();
		//System.getProperty("user.dir"): will retrive project folder location: c:..users//srujan/eclipse-workspace/batch98webdriver//
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/scripts/OR");
		
		pr.load(fis);
		
		String o1=pr.getProperty("bing.search.text.id");
		String o2=pr.getProperty("bing.search.button.id");
		
		System.out.println(o1);
		System.out.println(o2);
		
		WebDriver driver= new ChromeDriver();
		//open anappp
//		enteer value to search fiel
		
		driver.findElement(By.id(o1)).sendKeys("ramya");
		driver.findElement(By.id(o2)).click();
	}

}
