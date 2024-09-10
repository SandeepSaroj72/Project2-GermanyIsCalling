package assessment_GIC;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShotClass.class)
public class V_LoginPage extends I_BaseClass{
	
	// check whether textfield and login button is displayed and enabled or not
	@Test(priority = 13, enabled = true)
	public void signInTextfield() {
		
		
		boolean emailTextfield = driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
		boolean passwordTextfield = driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		boolean signUpButton = driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
			
		
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
			Reporter.log("Login button is Enabled", true);
		} else {
			Reporter.log("Login button is Disabled", true);
		}
		
	}
	

}
