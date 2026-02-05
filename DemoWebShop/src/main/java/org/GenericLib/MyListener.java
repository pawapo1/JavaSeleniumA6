package org.GenericLib;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener {

	@Override
public void onTestStart(ITestResult result) {
		Reporter.log("[Testcase"+result.getName()+ "has started]",true);
	}
@Override
	public void onTestSuccess(ITestResult result) {
    Reporter.log("[Testcase"+result.getName()+ "has sucessfully executed]",true);	
	}
@Override
	public void onTestFailure(ITestResult result) {
	String ldt=LocalDateTime.now().toString();
	String datetime = ldt.replaceAll(":", "-");
	TakesScreenshot	ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Errorshots/"+result.getName()+datetime+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
			
@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase"+result.getName()+ "has skipped]",true);	}
@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[Testcase"+result.getName()+ "has failed with some sucess percentage]",true);	
	}
@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("[Testcase"+result.getName()+ "has failed due to timeout ]",true);	
}
@Override
	public void onStart(ITestContext context) {
		Reporter.log("<Test>"+context.getName()+ "has started",true);	
}
   @Override
	public void onFinish(ITestContext context) {
		Reporter.log("<Test>"+context.getName()+ "has finished",true);	

	}

}
