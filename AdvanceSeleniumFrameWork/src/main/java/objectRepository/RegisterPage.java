package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText = "Register")
	private WebElement register;
	@FindBy(id = "gender-female")
	private WebElement gender;
	@FindBy(id = "FirstName")
	private WebElement FirstName;
	@FindBy(id = "LastName")
	private WebElement LastName;
	@FindBy(id = "Email")
	private WebElement Email;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpwd;
	@FindBy(id = "register-button")
	private WebElement RegisterButtom;
	public WebElement getRegister() {
		return register;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpwd() {
		return confirmpwd;
	}
	public WebElement getRegisterButtom() {
		return RegisterButtom;
	}

}
	
