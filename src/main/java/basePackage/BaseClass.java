package basePackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import webPagesPackage.WebpagesElements;



public class BaseClass {
	public WebDriver driver;
	public WebpagesElements webpagesElements;
   
	@BeforeMethod

	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        initMethods();
	}

	@AfterMethod
	public void tearUp() {
		 driver.quit();
	}
    
	private void initMethods() {
		webpagesElements=new WebpagesElements(driver);
	}
	
	
}