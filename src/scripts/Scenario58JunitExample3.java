package scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Scenario58JunitExample3 {
	
	@Before
	public void before(){
		System.out.println("this is before");
	}

	
	@After
	public void after(){
		System.out.println("this si after");
	}
	
	@Test //this test just like a main method 
	public void test(){
		System.out.println("test");
	}
	
}
