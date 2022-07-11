package Testmodelfirefox;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import AutomationPractice.HomeBaseFirefox;
import PageModelsAutomationPractice.SignInPage;
import PageModelsAutomationPractice.SignUpPage;
import PageModelsAutomationPractice.SignUpPage2;

public class june21 extends HomeBaseFirefox {

	
	SignInPage submit;
	
	
	
	
	@Test
	public void run1() {
		submit = new SignInPage(fdriver);
		submit.openSignUp(AppUrl, "xyz123123@gmail.com");
		
		
		
		
		
		
}
	
	
}
