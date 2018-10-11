package scripts;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario54ReadingPDF {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.votigo.com/overview_collateral.pdf");
		
		URL url=new URL(driver.getCurrentUrl());

		//the url of the current webpage and we r storing in rul variable
		
		BufferedInputStream fis= new BufferedInputStream(url.openStream());
		
		BufferedInputStream fileToParse= new BufferedInputStream(url.openStream());
		PDFParser parser= new PDFParser(fileToParse);
		parser.parse();
		String output=new PDFTextStripper().getText(parser.getPDDocument());
		System.out.println(output);
		parser.getPDDocument().close();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
		
		
	}

}
