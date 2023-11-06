package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText = "14.1-inch Laptop")
    private WebElement Laptop;
	@FindBy(id = "add-to-cart-button-31")
	private WebElement LaptopAddtoCart;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCart;
	
	
	@FindBy(linkText = "Jewelry")
	private WebElement jewelry;
	@FindBy(linkText = "Wishlist")
	private WebElement wishlist;
	public WebElement getWishlist() {
		return wishlist;
	}

	@FindBy(linkText = "Books")
	private WebElement books;
	public WebElement getBooks() {
		return books;
	}
	public WebElement getJewelry() {
		return jewelry;
	}
	@FindBy(linkText = "Computers")
	private WebElement coumputer;
	
	public WebElement getCoumputer() {
		return coumputer;
	}
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}
	public WebElement getLaptop() {
		return Laptop;
	}
	public WebElement getLaptopAddtoCart() {
		return LaptopAddtoCart;
	}
	
	
}
