package PageModelsAutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import AutomationPractice.HomeBase;

public class SignUpPage {
	WebDriver driver;
	  @FindBy(xpath ="//input[contains(@id,'gender2')]") WebElement Mrs; 
	//$x- console	//Rule 3 //tagname[contains(@attribute,'value')] 
	
	@FindBy(xpath ="//input[starts-with(@name,'customer_firstname')]") WebElement FirstName; 
	//Rule 4  //tagname[starts-with(@attribute,'value')]
	           
	
	@FindBy(xpath ="//input[starts-with(@id,'customer') and (@name ='customer_lastname')]") WebElement LastName;   
	//Rule 5 //tagname[starts-with(@attribute,'value') and (@attribute = 'value')]
	
	@FindBy(xpath ="//*[@id='passwd']") WebElement PassWord; 
				//Rule 6	 //*[@attribute='value']
	
				@FindBy(xpath ="//*[@id='days' or @name='days']") WebElement Days;
				    //Rule 7	//*[@attribute='value' or @attribute='value']
	
@FindBy(xpath ="//select[contains(@id,'months') and @name='months']") WebElement Months ;      
            
         //Rule 8      //tagname[contains(@attribute,'value') and @attribute='value'] 



//Rule 9	**Specialized
//tagname[text()='value']


@FindBy(xpath ="//select[contains(@id,'years') or (@name='years')]") WebElement Years ;
   //Rule 10 //tagname[contains(@attribute,'value') or (@attribute='value')]

public SignUpPage(WebDriver Driver)  {
	this.driver= Driver;
	
	PageFactory.initElements(Driver, this);
	
}

@SuppressWarnings("unchecked")
public void selectRadiobtn1() throws InterruptedException {
	//Thread.sleep(1500);
//Fxx.until(ExpectedConditions.elementToBeClickable(Mrs));
	//Ex.until(ExpectedConditions.elementToBeClickable(Mrs)); //The Expected Conditions For Explicit Wait
	Mrs.click();   //Needs 2 more seconds to load than usual after the page loads.
}


public void enterFirstname(String firstname) {
	FirstName.sendKeys(firstname);
}

public void enterLastName(String lastname) {
	LastName.sendKeys(lastname);
}

public void enterPassWord(String pass) {
	PassWord.sendKeys(pass);
}

public void selectDays(String inputdays) {
	Days.click();
	Select sinput = new Select(Days);
	sinput.selectByValue(inputdays);
} 
public void selectMonths(String inputmonths, int inputm) {
	Months.click();
Select sinput1 = new Select(Months);
sinput1.selectByValue(inputmonths);
sinput1.selectByIndex(inputm);
}
public void selectYears(String inputyears, int inputy, String inputyears2) {
	Years.click();
Select sinput2 = new Select(Years);
sinput2.selectByValue(inputyears);
sinput2.selectByIndex(inputy);
sinput2.selectByVisibleText(inputyears2);
}
	
	
	
	public void fillform( String First, String Last,String Pass, String Day,String Month, int Month2, String Years, int Years2, String Years3) throws InterruptedException {

	this.selectRadiobtn1();
	this.enterFirstname(First);
	this.enterLastName(Last);
	this.enterPassWord(Pass);
	this.selectDays(Day);
	this.selectMonths(Month,Month2);
	this.selectYears(Years, Years2, Years3);
	



	}
	
	
	
}
