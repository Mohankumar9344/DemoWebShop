package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Book;
import objectRepository.Computer;
import objectRepository.HomePage;
import objectRepository.Jewelry;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
import objectRepository.Wishlist;

/**
 * WithhOut Base Class WecCant Do Anything in framework 
 * we can add pre and post conditions,configuration annotations and all the test scripts should be extends from base class 
 */
public class BaseClass implements IAutoConstants{
	public static WebDriver driver;
	
	public static TakesScreenshotUtility screenshot;
	public static WebDriverUtility webdriverUtility;
	public static ExtentTest logger ;
	public static LoginPage loginpage;
	public static RegisterPage registerpage;
	public static Jewelry jewelry;
	public static Wishlist wishlist;
	public static Book book;
	public static Computer computer;
	PropertyUtility property;
	DataBaseUtility dbUtility;
	JavaUtility javaUtility;
	public static HomePage homepage;
	/**
	 * 
	 * This method is lanchingBrowser
	 */
	@BeforeClass(alwaysRun = true)
	public void LaumchingBrowsertoApplication() {
		property=new PropertyUtility();
		screenshot=new TakesScreenshotUtility(driver);
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("URL"));
		webdriverUtility=new WebDriverUtility(driver);
		screenshot=new TakesScreenshotUtility(driver);
		
		dbUtility=new DataBaseUtility();
		javaUtility=new JavaUtility();
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		registerpage=new RegisterPage(driver);
		jewelry=new Jewelry(driver);
		wishlist=new Wishlist(driver);
		book=new Book(driver);
		computer=new Computer(driver);

	}
	/**
	 * this method is used to login to the application
	 */
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication()
	{
		System.out.println("logged in to the application");
	}
	@AfterMethod(alwaysRun = true)
	public void logoutToApplication()
	{
		System.out.println("logged out from the application");
	}
	@AfterClass(alwaysRun = true)
	public void teardownTheBrowser()
	{
		driver.quit();
	}

	//public static WebDriver driver;
	//public static TakesScreenshotUtility screenshot;
	//	@BeforeMethod
	//	public static void demo() {
	//		WebDriverManager.chromedriver().setup();
	//	   ChromeOptions options= new ChromeOptions();
	//		options.addArguments("--remote-allow-origins=*");
	//		
	//	    driver=new ChromeDriver();
	//		driver.manage().window().maximize();
	//		screenshot=new TakesScreenshotUtility(driver);
	//	}
}