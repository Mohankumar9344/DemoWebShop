package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	@FindBy(id = "Email")
	private WebElement EmailField;
	@FindBy(id = "Password")
	private WebElement Passwordfield;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getEmailField() {
		return EmailField;
	}
	public WebElement getPasswordfield() {
		return Passwordfield;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}
