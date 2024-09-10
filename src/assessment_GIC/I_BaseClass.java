package assessment_GIC;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class I_BaseClass {
	
	public static WebDriver driver;
	
@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://app.germanyiscalling.com/");	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
