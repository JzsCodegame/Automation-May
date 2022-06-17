package Sprints;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AutomationPractice.HomeBase;

public class June14 extends HomeBase {
	
	
	
	
	@Test(priority = 3, groups = {"Createaccount"})      //step 1 : Provide annotation for the test step.
	 public void ClickMr() {							//step 2: Write the step or Method and use naming based on your test script.
		driver.findElement(By.cssSelector("#id_gender1")).click();   //Css rule 1
	}
	
	@Test(priority = 4, groups = {"Createaccount"}, alwaysRun = true)
	public void ClickContact1()  {
		//driver.findElement(By.tagName("input"));   //Css rule 1
		driver.findElement(By.linkText("Contact us")).click();
	}
	@Test(priority = 5, groups = {"Createaccount"})
	public void ClickContact2() {
		driver.findElement(By.partialLinkText("us")).click();
	}
	
}
