package assessment_GIC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VIII_SeeEachFeature  extends I_BaseClass{
	
	
	// click on every feature available on home page
	@Test(priority = 21, enabled = true)
	public void allFeatures() throws InterruptedException {
		String email="sandeepsaroj72040@gmail.com ";
		String password= "Sandeep@12345";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     Thread.sleep(3000);
	     
	    List<WebElement> allFeature = driver.findElements(By.xpath("//ul[@id='menu']//li"));    
	    for (int i = 0; i < allFeature.size(); i++) {
	    	allFeature = driver.findElements(By.xpath("//ul[@id='menu']//li"));    
	    	allFeature.get(i).click();
	    	Thread.sleep(5000);
			
		}

}
}