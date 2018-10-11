package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Scenario15RobotClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Robot rb= new Robot();
		
		Thread.sleep(5000);
		
		//ojkkl
		//keyboard operatons: 2 command 1 press and to release
		
		rb.keyPress(KeyEvent.VK_C);//press e key frm the keyboard
		rb.keyRelease(KeyEvent.VK_C);// release e key from the keyboard
		
		//column: : shift+semicolumn
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		
		//C:\\S2.png
		
	
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	}

}


