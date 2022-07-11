package testModelEdge;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import AutomationPractice.HomeEdge;
import PageModelsAutomationPractice.SignInPage;
import PageModelsAutomationPractice.SignUpPage2;

public class june29th extends HomeEdge  {
	
	SignUpPage2 submit3;
	
	
	@Test
	public void run3() {
		submit3 = new SignUpPage2(Edriver);
	submit3.fillform2("google", "123", "north","Richmond", "46","50960","21","xyz");
}
}
