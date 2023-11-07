package BOOK;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class TC_01_demo extends BaseClass {

	@Test
	public void launchbrowser()
	{
		driver.get("https://www.facebook.com");
	}
}
