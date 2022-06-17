package Sprints;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AutomationPractice.HomeBase;

public class June07 extends HomeBase {

	@Test(priority = 0, groups = {"signIn"})
	public void openApp() { //instance Method don't require call from main method. Each method defines a step or function for the test cases.
		driver.get(AppUrl);
	}
	@Test(priority = 1, groups = {"signIn"})
	public void clickSignIn() { // Here we are following the exact chronology of elements in the application.
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();// By method defines the html attribute.
	}//For us QA's clicksignIn is an integration point. Here using signin link we transition to another page or section.
	
	@Test(priority = 2, groups = {"signIn"}, invocationCount = 5)
	public void Emailaddress() {
		//driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("email_create")).sendKeys("xyz123123@gmail.com");
		driver.findElement(By.id("email_create")).clear();
		driver.findElement(By.id("email_create")).sendKeys("xyz123123@gmail.com");
			// id is a common way of finding elements or objects. We also called them locators.
		
	}
	@Test(dependsOnMethods = {"Emailaddress"}, groups = {"signIn"})
	public void createAccount() {
		//driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("SubmitCreate")).clik();// This button also an integration point. We are making transitions to signup page.
		
	}
	
	
}
