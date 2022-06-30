package PageModelsAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
WebDriver driver;// associate with this
	
	@FindBy(xpath ="//*[@id='header']/div[2]/div/div/nav/div[1]/a") WebElement SignIn;//Variable
	
	@FindBy(xpath = "//input[@id='email_create']") WebElement EnterEmail; //Rule 1	//tagname[@attribute='value']
	//Any Xpath without / single slash is relative and has rules.
	
	
	
	@FindBy(xpath = "//button[contains(@name,'Submit')]") WebElement SubmitEmail;//Rule 2	//tagname[contains(@attribute,'value')] 
	
	public SignInPage(WebDriver Driver)  {
		this.driver= Driver;
		
		PageFactory.initElements(Driver, this);
		
	}
	public void openApp(String AppUrl) { //instance Method don't require call from main method. Each method defines a step or function for the test cases.
		driver.get(AppUrl); //Parameterize method execution.
	}
	
	public String getmainpageTitle() {
		return driver.getTitle();
		
	}
	public void clickSignIn() {
	SignIn.click();
}
	public void Emailaddress(String email) {
		EnterEmail.sendKeys(email);
	
	}
	public void clickCreateAccount() {
		SubmitEmail.click();
		
	}
	
	
	public void openSignUp(String AppUrl, String EnterEmail) {
		this.openApp(AppUrl);
		this.getmainpageTitle();
		this.clickSignIn();
		this.Emailaddress(EnterEmail);
		this.clickCreateAccount();
	}
}
