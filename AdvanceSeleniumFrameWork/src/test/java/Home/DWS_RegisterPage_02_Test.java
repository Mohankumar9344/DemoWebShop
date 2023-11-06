package Home;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_RegisterPage_02_Test extends BaseClass {
	@Test(groups = "FT")
	public void Register_DWS(){
		registerpage.getRegister().click();
		logger.log(Status.INFO, "User can click Register link");
		registerpage.getGender().click();
		logger.log(Status.INFO,"user can click gender" );
		registerpage.getFirstName().sendKeys("Rani");
		logger.log(Status.INFO,"User Entered FirstName");
		registerpage.getLastName().sendKeys("DV");
		logger.log(Status.INFO,"User Entered LastName");
		registerpage.getEmail().sendKeys("dmohan99@gmail.com");
		logger.log(Status.INFO,"User Entered Email");
		registerpage.getPassword().sendKeys("123456");
		logger.log(Status.INFO,"User Entered password");
		registerpage.getConfirmpwd().sendKeys("123456");
		logger.log(Status.INFO,"User Entered confirmpwd");
		registerpage.getRegisterButtom().click();
		
		
	}

}
