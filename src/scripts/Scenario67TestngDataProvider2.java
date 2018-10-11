package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Scenario67TestngDataProvider2 {
  @Test(dataProvider = "ramya1")
  public void test(String u, String p) {
	  System.out.println(p);
	  System.out.println(u);
  }

  
  //reutrn type of this data provider: object multiple sets of values
 
  @DataProvider(name="ramya1")
  public Object[][] data1(){
		
		return new Object[][] { { "user_1", "pswd1" }, { "user_2", "pswd2" }};
	}
  
  @DataProvider(name="ramya2")
  public Object[][] data2(){
		
		return new Object[][] { { "user_1", "pswd1" }, { "user_2", "pswd2" }};
	}

  @DataProvider(name="ramya3")
  public Object[][] data3(){
		
		return new Object[][] { { "user_1", "pswd1" }, { "user_2", "pswd2" }};
	}
  
  @DataProvider(name="ramya4")
  public Object[][] data4(){
		
		return new Object[][] { { "user_1", "pswd1" }, { "user_2", "pswd2" }};
	}
  
}
