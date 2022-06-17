package Sprints;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AutomationPractice.HomeBase;

public class June16 extends HomeBase {

	@Test(priority = 6,groups = {"AccountInfo"})
	public void SignIn() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	@Test(priority = 7,groups = {"AccountInfo"})
	public void EmailInfo() {
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).click();
		
	}
	
	
}
