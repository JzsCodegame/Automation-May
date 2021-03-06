package AutomationPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class HomeBase {
	 
   public static WebDriver driver; //We create at class level.. so Static Object can be accessed anywhere.  
   public static WebDriver fdriver;
   public static WebDriver Edriver;
   
	public static String AppUrl;//We create at class level.. so Static Variable can be accessed anywhere 
    public static String Google;//Google can be accessed from everywhere.
    public static WebDriverWait Ex;//This is the class for explicit wait and Ex is the object of the class 
    public static FluentWait Fx;
	public static Wait Fxx;
    public ChromeOptions options;
	
	@BeforeSuite(groups = {"Config_Control"}) //Declare The Annotations
		public void config() {  //Declare The Method
			//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver102.exe");//Write The statements or code based on requirement. In this case using driver configurations.
		//	System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
		//	System.setProperty("webdriver.firefox.driver", "Drivers/geckodriver.exe");
        WebDriver driver = null;
        WebDriverManager.chromedriver().browserVersion("77.0.3865.40").setup();
        options = new ChromeOptions();
        options.addArguments("start-maximized"); 
        options.addArguments("enable-automation"); 
        options.addArguments("--no-sandbox"); 
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation"); 
        options.addArguments("--disable-gpu");
			Google = "https://www.google.com/";//Variable Configurations meaning provide values to variables.
			AppUrl = "http://automationpractice.com/index.php";
		}
	
	
	@BeforeTest(groups = {"Config_Control"})
	public void setup() {
       // WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);//ChromeDriver() is the Constructor ChromeDriver class.So before test we instantiate which driver we will use.
		//fdriver = new FirefoxDriver();
		//Edriver = new EdgeDriver();
		Ex = new WebDriverWait(driver, 15);  //This is what we use for Explicit Wait. This has a driver parameter and the timer parameter.
		//driver1 = new EdgeDriver();
		 Fxx = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
	}
	
	
	
	
	@BeforeClass(groups = {"Config_Control"})
	    public void Synchronize(){  //
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);// Implicitly wait in general for 10 seconds. We synchronize how the code and machine will run.
	//	fdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Edriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	
	@BeforeMethod(groups = {"Config_Control"}) 
	public void BrowserConfig()  {
		
		driver.manage().window().maximize(); //We maximize or change browser based on our preference.
	}
	
	
	
	@AfterMethod(groups = {"Config_Control"})
	public void validations(){
    	System.out.println("Validations succesfull");// We validate our code executions.
    	System.out.println("Method executed succesfully");
    	
    }
	
	
	@AfterMethod(groups = {"Config_Control"})
	public void validations2(){
    	System.out.println("Validations are not  succesfull");// We validate our code executions.
    	System.out.println("Method executed not succesfully");
    	
    }
	
	
	@AfterClass(groups = {"Config_Control"}) 
	  public void PageValidations() {
		System.out.println("Page executed succesfully");// We print confirmation message that page has been executed successfully. 
	}
	
	
	@AfterTest(groups = {"Config_Control"})
	public void BrowserClosing() throws InterruptedException {
		Thread.sleep(5000); //We use thread.sleep to make Java wait so we can see our execution results.
		driver.close();// We close the browser
		
	}
	
	
	@AfterSuite(groups = {"Config_Control"})
	public void terminate() {
		driver.quit(); // We close the instance and terminate the session. It will erase all the cache memory and make our next execution better.
	}
	
}
