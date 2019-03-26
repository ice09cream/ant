package danyuances;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class NewTest1 {
	test5_1 y=new test5_1();
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  
  }
  @Test
	public void testSs() {
	y.ss(10);
	
	}

	@Test
	public void testSss() {
	y.sss(10);
	}
}
