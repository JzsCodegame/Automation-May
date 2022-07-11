package Testmodel;

import org.testng.annotations.Test;

import AutomationPractice.HomeBase;
import PageModelsAutomationPractice.SignUpPage;

public class june25th extends HomeBase  {
	SignUpPage submit2;
	@Test
	public void run2() throws InterruptedException {
		submit2 = new SignUpPage(driver);
		submit2.fillform("jatinder","tori","passcode", "21", "12", 5, "1999",8,"2017  ");	
	}
}
