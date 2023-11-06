package Jewelry;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_RemoveFromWishList_10_Test extends BaseClass {
	@Test(groups = "ST")
	public void RemoveWishlist() throws InterruptedException {
		homepage.getJewelry().click();
		logger.log(Status.INFO, "User click on Jewelry");
		jewelry.getDiamondHeart().click();
		logger.log(Status.INFO , "User select on product");
		jewelry.getAddtoWishlist().click();
		logger.log(Status.INFO, "User click on add to wishlist");
		driver.navigate().back();
		driver.navigate().back();
	    homepage.getWishlist().click();
		logger.log(Status.INFO, "product is displayed");
		wishlist.getRemovewishlist().click();
		Thread.sleep(2000);
		logger.log(Status.INFO, "product is select checklist");
		wishlist.getUpdatecart().click();
		logger.log(Status.INFO, "product is removed");
	}
	

}
