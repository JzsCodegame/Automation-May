package testModelEdge;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import AutomationPractice.HomeEdge;
import PageModelsAutomationPractice.SignInPage;
import PageModelsAutomationPractice.SignUpPage;
import PageModelsAutomationPractice.SignUpPage2;

public class june21 extends HomeEdge {

	
	SignInPage submit;
	
	
	
	
	@Test
	public void run1() {
		submit = new SignInPage(Edriver);
		
		submit.openSignUp(AppUrl, "xyz123123@gmail.com");
		
		
		
		
		
		
}
	
	
}
