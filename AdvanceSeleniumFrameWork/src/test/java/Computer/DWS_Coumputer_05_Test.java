package Computer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_Coumputer_05_Test extends BaseClass {
	@Test(groups = "IT")
	public void CompareTwoProduct() {
		homepage.getCoumputer().click();
		logger.log(Status.INFO, "user click on coumputer");
		computer.getDesktop().click();
		logger.log(Status.INFO, "user select on desktops");
		computer.getCheapcoumputer().click();
		logger.log(Status.INFO, "user click on cheap coumputer");
		computer.getCompareList().click();
		driver.navigate().back();
		logger.log(Status.INFO, "user click on back");
		driver.navigate().back();
		logger.log(Status.INFO, "user click on back");
		computer.getOwnCoumputer().click();
		logger.log(Status.INFO, "user click on own coumputer");
		computer.getCompareList().click();
		List<WebElement> remove = driver.findElements(By.xpath("//input[@value='Remove']"));
		int count=remove.size();
		if (count==2) {
			logger.log(Status.PASS,"test case is pass");
		}
		else {
			logger.log(Status.FAIL, "test case is fail");
		}
		
		
	}
	

}
