package openbaidu;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class openbaisdu {
	private WebDriver driver;
	private String baseUrl;
	@Test
	 public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    baseUrl = "http://www.baidu.com";
		    driver.get(baseUrl);
		    driver.findElement(By.id("kw")).sendKeys("hh");
		    driver.findElement(By.id("su")).click();
		  }
}
