package assessment_GIC;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShotClass.class)
public class VII_UploadCV extends I_BaseClass{
	
	
	// Validate whether user is able to upload CV
	@Test(priority = 20, enabled = true)
	public void UploadFile() throws InterruptedException {
		String email="sandeepsaroj72040@gmail.com ";
		String password= "Sandeep@12345";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//div[@class='card-body pt-5 pb-5'])[1]")).click();
	     Thread.sleep(2000);
	     File upload=new File("./TestData/Sandeep Saroj Resume17.0.pdf");
	     String resume = upload.getAbsolutePath();
	     driver.findElement(By.xpath("//input[@id='id_cv_file']")).sendKeys(resume);
	     
	}


}
