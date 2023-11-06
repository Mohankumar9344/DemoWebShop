package Computer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_CoumputerRemove_06_Test extends BaseClass {
	@Test(groups = "ST")
	public void RemoveCompare() {
		homepage.getCoumputer().click();
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
		for(WebElement element:remove) {
			try {
				element.click();
			}
			catch (StaleElementReferenceException e) {
			  e.getMessage();
			}
		}
		
	}

}
