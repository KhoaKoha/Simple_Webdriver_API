package scripts;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.asprise.util.ocr.OCR;

public class Scenario55ReadingImage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/Srujan/Desktop/mythoughts.html");
		
		String imageURL=driver.findElement(By.xpath("//img")).getAttribute("src");
		
		 URL url = new URL(imageURL);  
		 Image image = ImageIO.read(url);
		 
		 
		 // we are asking it to recognize the characers present in the image and we are asking to it to read the contnet and to store the content in a variable
		 String s = new OCR().recognizeCharacters((RenderedImage) image);  
		 
		 //below cmd is simply printing the information
		 System.out.println("Text From Image : \n"+ s);  
	

	}

}
