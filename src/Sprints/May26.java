package Sprints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver; //Declaring the driver object of webdriver interface.
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Automation2022-May\\Drivers\\chromedriver101.exe");
driver = new ChromeDriver();// Cannot initialize because WebDriver is an Interface.
driver.get("http://automationpractice.com/index.php");
driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}

}
