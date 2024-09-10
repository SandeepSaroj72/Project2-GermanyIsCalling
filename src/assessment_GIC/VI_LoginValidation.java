package assessment_GIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShotClass.class)
public class VI_LoginValidation  extends I_BaseClass{
	
	
	  // Login Validation with valid Credential
	@Test(priority = 14, enabled = true)
	public void loginValidation1() {
		String email="sandeepsaroj72040@gmail.com ";
		String password= "Sandeep@12345";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     WebElement LoginPage = driver.findElement(By.xpath("//button[@class='btn btn-danger mt-4']"));
	     
	     if (LoginPage.isDisplayed()) {
	    	 Reporter.log("Login successful for " + "Email: " + email + "and password: "+ password , true);
		} else {
			Reporter.log("Login Failed" , true);
		}	     
	}

		
	
	 // Login Validation with Invalid Credential
	@Test(priority = 15, enabled = true)
	public void loginValidation2() {
		String email="Sandeep@12345";
		String password= "sandeepsaroj72040@gmail.com";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	     
	     if (errormessage.isDisplayed()) {
	    	 Reporter.log("Login Failed ErrorMessage = " + errormessage.getText(), true);
		} else {
			Reporter.log("Login successful for Email: " + email + "and password: "+ password , true);
		}	     
	}
	
	
	// Login Validation with Invalid Credential
	@Test(priority = 16, enabled = true)
	public void loginValidation3() {
		String email="  ";
		String password= "  ";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	     
	     if (errormessage.isDisplayed()) {
	    	 Reporter.log("Login Failed ErrorMessage = " + errormessage.getText(), true);
		} else {
			Reporter.log("Login successful for Email: " + email + "and password: "+ password , true);
		}	     
	}
	
	// Login Validation with Invalid Credential
	@Test(priority = 17, enabled = true)
	public void loginValidation4() {
		String email="sandeepsarojgmail.com";
		String password= "125566988555";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	     
	     if (errormessage.isDisplayed()) {
	    	 Reporter.log("Login Failed ErrorMessage = " + errormessage.getText(), true);
		} else {
			Reporter.log("Login successful for Email: " + email + "and password: "+ password , true);
		}	     
	}
	
	
	// Login Validation with Invalid Credential
	@Test(priority = 18, enabled = true)
	public void loginValidation5() {
		String email="886554@gmail.com";
		String password= "125566988555";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	     
	     if (errormessage.isDisplayed()) {
	    	 Reporter.log("Login Failed ErrorMessage = " + errormessage.getText(), true);
		} else {
			Reporter.log("Login successful for Email: " + email + "and password: "+ password , true);
		}	     
	}
	
	
	
	// Login Validation with Invalid Credential
	@Test(priority = 19, enabled = true)
	public void loginValidation6() {
		String email="@gmail.com";
		String password= "***********";
		
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[text()='Log In']")).click();
	     WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
	     
	     if (errormessage.isDisplayed()) {
	    	 Reporter.log("Login Failed ErrorMessage = " + errormessage.getText(), true);
		} else {
			Reporter.log("Login successful for Email: " + email + "and password: "+ password , true);
		}	     
	}
	
	

	
}
