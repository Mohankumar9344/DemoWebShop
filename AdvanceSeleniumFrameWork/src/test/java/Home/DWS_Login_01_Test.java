package Home;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider = "data",dataProviderClass = ExcelUtility.class,groups = "FT")
	public void Login_to_application_with_valid_credential(String email,String password) throws InterruptedException {
		loginpage.getLoginlink().click();
		logger.log(Status.INFO, "User click on login link");
		
		loginpage.getEmailField().sendKeys(email);
		logger.log(Status.INFO, "User Entered Email address");
		//assertFalse(true);
		
		loginpage.getPasswordfield().sendKeys(password);
		logger.log(Status.INFO, "User Entered Password");
		loginpage.getLoginbutton().click();
		
	}

}
