package assessment_GIC;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class II_GetScreenShotClass extends I_BaseClass implements ITestListener{

	

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		String giveFileName = result.getName();
		File destinationFile = new File("./GetScreenShot/"+giveFileName+".png");
		
		try {
			Files.copy(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ITestListener.super.onTestFailure(result);
	}



	






	

}
