package Testmodel;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import PageModelsAutomationPractice.SignInPage;
import PageModelsAutomationPractice.SignUpPage2;

public class june29th extends HomeBase  {
	
	SignUpPage2 submit3;
	
	
	@Test
	public void run3() {
		submit3 = new SignUpPage2(driver);
	submit3.fillform2("google", "123", "north","richmond", "virginia","50960", "U.S", "xyz");
}
}
