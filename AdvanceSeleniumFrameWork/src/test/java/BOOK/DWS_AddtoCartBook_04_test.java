package BOOK;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_AddtoCartBook_04_test extends BaseClass{
	@Test(groups = "IT")
	public void Book_Addtocart() {
	homepage.getBooks().click();
	logger.log(Status.INFO, "User click on book link");
	book.getSelectBook().click();
	logger.log(Status.INFO, "User Select product book");
	book.getBookAddtoCart().click();
	logger.log(Status.INFO, "user can add book on addtocart");
	homepage.getShoppingCart().click();
	logger.log(Status.INFO," Product is displayed");
		
	}

}
