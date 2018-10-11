package scripts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Scenario56JunitExample1 {

	//setup checkbox: 1st 
	@Before
	public void setUp() throws Exception {
		
		System.out.println("before");
	}

	//teardown checkbox: last
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test//2nd
	public void test1() {
		
		System.out.println("test1");
		
	}

	
	@Test//2nd
	public void test2() {
		
		System.out.println("test2");
		
	}
	
	
	//before and after will execute before the test method and after the test method
	
	
}
