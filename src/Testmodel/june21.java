package Testmodel;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import PageModelsAutomationPractice.SignInPage;
import PageModelsAutomationPractice.SignUpPage;
import PageModelsAutomationPractice.SignUpPage2;

public class june21 extends HomeBase {

	
	SignInPage submit;
	
	
	
	
	@Test
	public void run1() {
		submit = new SignInPage(driver);
		submit.openSignUp(AppUrl, "xyz123123@gmail.com");
		
		
		
		
		
		
}
	
	
}
