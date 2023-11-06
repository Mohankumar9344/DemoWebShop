package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book {
	public Book(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	
	public WebElement getSelectBook() {
		return SelectBook;
	}
	public WebElement getBookAddtoCart() {
		return bookAddtoCart;
	}

	@FindBy(linkText = "Computing and Internet")
	private WebElement SelectBook;
	@FindBy(id = "add-to-cart-button-13")
	private WebElement bookAddtoCart;
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement EmailaFriend;
	public WebElement getEmailaFriend() {
		return EmailaFriend;
	}
	@FindBy(id="FriendEmail")
	private WebElement frdEmail;
	@FindBy(id="YourEmailAddress")
	private WebElement yourEmail;
	@FindBy(name = "send-email")
	private WebElement sendemail;
	public WebElement getSendemail() {
		return sendemail;
	}


	public WebElement getFrdEmail() {
		return frdEmail;
	}

	public WebElement getYourEmail() {
		return yourEmail;
	}
}
