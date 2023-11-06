package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelry {
	public Jewelry(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//a[@href='https://demowebshop.tricentis.com/jewelry?price=0-500']")
	private WebElement FilterPrice0_500;
	@FindBy(linkText = "Black & White Diamond Heart")
	private WebElement DiamondHeart;
	@FindBy(id = "add-to-wishlist-button-14")
	private WebElement AddtoWishlist;
	
	public WebElement getDiamondHeart() {
		return DiamondHeart;
	}
	public WebElement getAddtoWishlist() {
		return AddtoWishlist;
	}
	public WebElement getFilterPrice0_500() {
		return FilterPrice0_500;
	}
	
	
	

}
