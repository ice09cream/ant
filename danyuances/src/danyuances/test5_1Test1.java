package danyuances;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class test5_1Test1 {
	test5_1 y=new test5_1();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void testAdd() {
		int result=y.add(1, 4);
		//╤оят
		assertEquals(5,result);
	}

	@Test
	public void testSub() {
		int result=y.sub(10, 3);
		assertEquals(7,result);
	}

	@Test
	public void testJi() {
		int result=y.ji(10, 10);
		assertEquals(100,result);
	}
	

	@Test
	public void testChu() {
		int result=y.chu(10, 5);
		assertEquals(2,result);
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
