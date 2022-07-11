package Testmodelfirefox;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import AutomationPractice.HomeBaseFirefox;
import PageModelsAutomationPractice.SignInPage;
import PageModelsAutomationPractice.SignUpPage2;

public class june29th extends HomeBaseFirefox  {
	
	SignUpPage2 submit3;
	
	
	@Test
	public void run3() {
		submit3 = new SignUpPage2(fdriver);
	submit3.fillform2("google", "123", "north","Richmond", "46","50960","21","xyz");
}
}
