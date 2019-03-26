package danyuances;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest {
	test5_1 y=new test5_1();
	@BeforeClass
  public void f() {
	  System.out.println("BeforeClass");
  }
	@AfterClass
	public static void AfterClass(){
		System.out.println("AfterClass");
	}
	@Test
	public void testAdd() {
		int result=y.add(1, 4);
		Assert.assertEquals(5,result);
	}

	@Test
	public void testSub() {
		int result=y.sub(10, 3);
		Assert.assertEquals(7,result);
	}

	@Test
	public void testJi() {
		int result=y.ji(10, 10);
		Assert.assertEquals(100,result);
	}
	

	@Test
	public void testChu() {
		int result=y.chu(10, 5);
		Assert.assertEquals(2,result);
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
