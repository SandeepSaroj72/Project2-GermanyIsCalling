package assessment_GIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShotClass.class)
public class IV_SignUpValidation extends I_BaseClass{

		
     //  SignUp with already used valid data
	@Test(priority = 3, enabled = true)
	public void SignUpValidation1() throws InterruptedException {
		
		String name="Sandeep ";
		String email="sandeepsaroj72198@gmail.com  ";
		String password="Sandeep@8855 ";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
        
	}
	
	
	
	
     //  SignUp with Invalid data
	@Test(priority = 4, enabled = true)
	public void SignUpValidation2() throws InterruptedException {
		
		String name=" ";
		String email="  ";
		String password=" ";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
        
	}
	
	
	
      //  SignUp with Invalid data
	@Test(priority = 5, enabled = true)
	public void signUpValidation3() throws InterruptedException {
		String name="Sandeep ";
		String email="  ";
		String password=" ";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
	
	
      //  SignUp with Invalid data
	@Test(priority = 6, enabled = true)
	public void signUpValidation4() throws InterruptedException {
		String name="Sandeep ";
		String email="sandeepsaroj72040@gmail.com";
		String password=" ";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
	
     //  SignUp with Invalid data
	@Test(priority = 7, enabled = true)
	public void signUpValidation5() throws InterruptedException {
		String name="Sandeep ";
		String email="sandeepsaroj72040";
		String password="1234567";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
     //  SignUp with Invalid data
	@Test(priority = 8, enabled = true)
	public void signUpValidation6() throws InterruptedException {
		String name="1234567";
		String email="Sandeep";
		String password="sandeepsaroj72040@gmail.com";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
     //  SignUp with Invalid data
	@Test(priority = 9, enabled = true)
	public void signUpValidation7() throws InterruptedException {
		String name="Sandeep1234567";
		String email="123548@gmail.com";
		String password="Sandeep@456";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
    //  SignUp with Invalid data
	@Test(priority = 10, enabled = true)
	public void signUpValidation8() throws InterruptedException {
		String name="***********";
		String email="***********";
		String password="*********";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
     //  SignUp with Invalid data
	@Test(priority = 11, enabled = true)
	public void signUpValidation9() throws InterruptedException {
		String name="sandeepsaroj72040@gmail.com";
		String email="sandeepsaroj72040@gmail.com";
		String password="Sandeep@12345";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}
	
	
     //  SignUp with Invalid data
	@Test(priority = 12, enabled = true)
	public void signUpValidation10() throws InterruptedException {
		String name="Sandeep Saroj";
		String email="sandeepsaroj.com";
		String password="Sandeep@12345";
          
		 driver.findElement(By.xpath("(//a[@class='text-dark'])[2]")).click();	 
         driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(2000);
		 System.out.println("  ");
		 
         driver.findElement(By.xpath("//button[@type='submit']")).click();     
        WebElement errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        
        if (errormessage.isDisplayed()) {
        	Reporter.log("SignUp Failed ErrorMessage = " + errormessage.getText(), true);
			
		} else {
			Reporter.log("SignUp successful for  Name: "+ name + "Email: " + email + "and password: "+ password , true);
		}    
	}	
	
		
		
}
