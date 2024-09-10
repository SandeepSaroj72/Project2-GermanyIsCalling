package assessment_GIC;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShotClass.class)
public class III_SignUPPage extends I_BaseClass{
	
	
	
	// webpage Title
	@Test(priority = 1, enabled = true)
	public void webPageTitle() {
		String title = driver.getTitle();
		Reporter.log("Title of WebPage: " + title, true);
	}
	
	
	
	// check whether textfield and sign up button is displayed and enabled  or not
	@Test(priority = 2, enabled = true)
	public void signUpTextfields() {
		driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();
		
		boolean nameTextfield = driver.findElement(By.xpath("//input[@id='first_name']")).isDisplayed();
		boolean emailTextfield = driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
		boolean passwordTextfield = driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		boolean signUpButton = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		if (nameTextfield==true) {
			Reporter.log("Name TextField is Displayed", true);
			
		} else {
			Reporter.log("Name TextField is Not Displayed", true);
		}
		
		if (emailTextfield==true) {
			Reporter.log("Email TextField is Displayed", true);
		} else {
			Reporter.log("Email TextField is Not Displayed", true);
		}
		
		if (passwordTextfield==true) {
			Reporter.log("Password TextField is Displayed", true);
		} else {
			Reporter.log("Password TextField is Not Displayed", true);
		}
		
		if (signUpButton==true) {
			Reporter.log("SignUp button is Enabled", true);
		} else {
			Reporter.log("SignUp button is Disabled", true);
		}
		
	}

}
