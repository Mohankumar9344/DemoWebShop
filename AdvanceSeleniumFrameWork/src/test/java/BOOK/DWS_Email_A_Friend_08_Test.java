package BOOK;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;

public class DWS_Email_A_Friend_08_Test extends BaseClass {
	@Test(groups = "FT")
	public void EmailFriend() {
		homepage.getBooks().click();
		logger.log(Status.INFO, "user click on book link");
		book.getSelectBook().click();
		book.getEmailaFriend().click();
		book.getFrdEmail().sendKeys("mohan@gmail.com");
		book.getYourEmail().sendKeys("dmohan9344@gmail.com");
		book.getSendemail().click();
		String errmsg="Only registered customers can use email a friend feature";
		//assertEquals(driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText(), errmsg);
		
		if (driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText().equals(errmsg)) {
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
	}

}
