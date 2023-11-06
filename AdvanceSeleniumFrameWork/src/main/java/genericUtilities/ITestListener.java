package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ITestListener extends BaseClass implements org.testng.ITestListener 
{

	ExtentReports reports;
	
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./report/demo.html");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setReportName("MohanKumar");
	}
	public void onTestStart(ITestResult result) {
		logger= reports.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "this test case is "+result.getName()+"pass");
	}
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "this test case is"+result.getName()+"fail");
		logger.addScreenCaptureFromPath(screenshot.capturingScreenshot(result.getName()));
	}
	public void onTestSkipped(ITestResult result) {

	}
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
