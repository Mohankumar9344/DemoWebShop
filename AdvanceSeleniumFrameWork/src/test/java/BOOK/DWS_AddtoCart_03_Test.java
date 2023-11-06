package BOOK;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_AddtoCart_03_Test extends BaseClass {

	@Test(groups = "IT")
	public void Add_Product_to_AddToCart() {
	 homepage.getLaptop().click();
	 logger.log(Status.INFO, "User click on laptop link");
	 homepage.getLaptopAddtoCart();
	 logger.log(Status.INFO, "User can add to cart");
	 homepage.getShoppingCart().click();
	
	 
	}
}


