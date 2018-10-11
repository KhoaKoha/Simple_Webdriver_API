package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Scenario66TestngDataProvider1 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  
  //reutrn type of this data provider: object multiple sets of values
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
