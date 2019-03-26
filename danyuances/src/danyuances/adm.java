package danyuances;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class adm {
	private WebDriver driver;
	private String baseUrl;

  @BeforeClass
  public void beforeClass()throws Exception  {
	  driver = new ChromeDriver();
	  baseUrl = "https://www.baidu.com/";

  }

  @AfterClass
  public void afterClass() {
  }

}
