package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	public static String AppUrl;//We create at class level.. so Static Variable can be accessed anywhere 
    public static String Google;//Google can be accessed from everywhere.
    public static WebDriverWait Ex;//This is the class for explicit wait and Ex is the object of the class 
	
	
	@BeforeSuite(groups = {"Config_Control"}) //Declare The Annotations
		public void config() {  //Declare The Method
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver102.exe");//Write The statements or code based on requirement. In this case using driver configurations.
			//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
			Google = "https://www.google.com/";//Variable Configurations meaning provide values to variables.
			AppUrl = "http://automationpractice.com/index.php";
		}
	@BeforeTest(groups = {"Config_Control"})
	public void setup() {
		
		driver = new ChromeDriver();//ChromeDriver() is the Constructor ChromeDriver class.So before test we instantiate which driver we will use.
		Ex = new WebDriverWait(driver, 10);
		//driver1 = new EdgeDriver();
	}
	@BeforeClass(groups = {"Config_Control"})
	 public void Synchronize(){
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);// Implicitly wait in general for 10 seconds. We synchronize how the code and machine will run.
	}
	@BeforeMethod(groups = {"Config_Control"}) 
	public void BrowserConfig() {
		
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
