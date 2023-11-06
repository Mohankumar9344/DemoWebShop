package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer {
	public Computer(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(linkText = "Desktops")
	private WebElement desktop;
	@FindBy(linkText = "Build your own cheap computer")
	private WebElement cheapcoumputer;
	@FindBy(linkText = "Build your own computer")
	private WebElement ownCoumputer;
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement CompareList;
	
	public WebElement getDesktop() {
		return desktop;
	}
	public WebElement getCheapcoumputer() {
		return cheapcoumputer;
	}
	public WebElement getOwnCoumputer() {
		return ownCoumputer;
	}
	public WebElement getCompareList() {
		return CompareList;
	}

}
