package Jewelry;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_Jewelry_AddtoWishlist_09_Test extends BaseClass {
	@Test(groups = "IT")
	public void wishlist() {
		homepage.getJewelry().click();
		logger.log(Status.INFO, "User click on Jewelry");
		jewelry.getDiamondHeart().click();
		logger.log(Status.INFO , "User select on product");
		jewelry.getAddtoWishlist().click();
		logger.log(Status.INFO, "User click on add to wishlist");
//		String s=driver.findElement(By.xpath("//p[@class='content']")).getText();
//		String errmsg="The product has been added to your ";
//		assertEquals(driver.findElement(By.xpath(s)).getText(),errmsg);
		logger.log(Status.INFO," product is added to wishlist");
		homepage.getWishlist().click();
		logger.log(Status.INFO, "product is displayed");

	}
}
