package Jewelry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListener;
@Listeners(ITestListener.class)
public class DWS_JewelryPriceFilter_07_Test extends BaseClass{
	@Test(groups = "ST")
	public void Filterprice() {
		homepage.getJewelry().click();  
		jewelry.getFilterPrice0_500().click();
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='prices']"));
		for(WebElement price:allprice) {
			String p=price.getText();
			String r=p.substring(0,p.length()-3);
			int pr=Integer.parseInt(r);
			if (pr>=0 && pr<=500) {
				logger.log(Status.PASS, "this test case is pass");
				System.out.println("this price range is 0-500 between "+pr);
			}
			else
			{
				logger.log(Status.FAIL, "this test case is fail");
				System.out.println("this price range is not 0-500 between  "+pr);
			}
			
		}
	}

}
