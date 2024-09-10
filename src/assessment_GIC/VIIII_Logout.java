package assessment_GIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VIIII_Logout extends I_BaseClass{
	
	
	@Test(priority = 22, enabled = true)
	public void allFeatures() throws InterruptedException {
		String email="sandeepsaroj72040@gmail.com ";
		String password= "Sandeep@12345";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath("//div[@class='dropdown pb-4']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//a[@class='text-decoration-none text-danger dropdown-item'])[1]")).click();
	     
	     WebElement LoginPage = driver.findElement(By.xpath("(//div[@class='card-body pt-5 pb-5'])[1]"));
	     if (LoginPage.isDisplayed()) {
			Reporter.log("Successfully Logout ", true);
		} else {
			Reporter.log("Logout  Failed", true);
		}
	     
	     
}
}