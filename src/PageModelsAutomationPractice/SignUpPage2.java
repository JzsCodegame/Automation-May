package PageModelsAutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import AutomationPractice.HomeBase;

public class SignUpPage2 {
	WebDriver driver;
	
	@FindBy(css ="input[id='company']") WebElement Company;
	//$$ - Console //CSS rule   1      tagname[attribute='value']
	
	@FindBy(css ="input#address1") WebElement Address ;
	           //Css rule   2      tagname#id-value
	@FindBy(css = "input#address2") WebElement Address2 ;
			//Css rule   3     tagname.class-value )
	
	
	@FindBy(css = "input#city.form-control") WebElement City ;
	
	//id = #
	//Class = .
	//Css rule   4      .class-value.class-value..... *if multiple value of class with spaces
	
	
	@FindBy(css = "select.form-control[name='id_state']") WebElement State ;
	
	//CSS rule 5 = tagname.class[attribute='value'] // using class and attribute
	
	@FindBy(css = ".form-control.uniform-input.text") WebElement ZipCode ;
	//Css rule   4      .class-value.class-value..... *if multiple value of class with spaces
	
	@FindBy(css = "#id_country") WebElement Country ;
//Css rule   6      #(id-value)
	
	@FindBy(css = "label[for*='phone_']") WebElement labelMobilePhone ;
	//Css rule - 7      tagname[attribute*='sub_string_slashunder']
	
	@FindBy(css = "input[id^='ali']") WebElement Alias ;
	//Css rule - 8      tagname[attribute^='start of String'] //Prefix beginning of a string of characters

	
	@FindBy(css = "input[type='checkbox'][id='newsletter']") WebElement Checkbox1 ;
	//Css rule - 9    tagname[attribute1='value'][attribute2='value']

	@FindBy(css = "input[id$=n]") WebElement Checkbox2 ;
	//Css rule - 10     tag[attribute$=suffix of the string]   Suffix means end characters of a string
	
	

public SignUpPage2(WebDriver Driver)  {
		this.driver= Driver;
		
		PageFactory.initElements(Driver, this);
		
	}
public void company(String company) {
	Company.sendKeys(company);
}


public void address (String addrss) {
	Address.sendKeys(addrss);
}

public void address2 (String addrss2) {
	Address2.sendKeys(addrss2);
}

public void city(String citi) {
	City.sendKeys(citi);
}

public void state(String inputstate) {
	State.click();
	Select sinput = new Select(State);
	sinput.selectByValue(inputstate);
} 

public void zipcode (String zip) {
	ZipCode.sendKeys(zip);
}
public void country(String inputcountry) {
	Country.click();
	Select sinput = new Select(Country);
	sinput.selectByValue(inputcountry);
} 
public void label9() {
	System.out.println(labelMobilePhone.getText());
	
}
public void alias(String ali) {
	Alias.sendKeys(ali);
}
public void checkbox1() {
	Checkbox1.click();
}
public void checkbox2() {
	Checkbox2.click();
}
public void fillform2(String co,String ad, String ad2, String ct, String st, String zp,String cy,String al) {
	this.company(co);
	this.address(ad);
	this.address2(ad2);
	this.city(ct);
	this.state(st);
	this.zipcode(zp);
	this.country(cy);
	this.label9();
	this.alias(al);
	this.checkbox1();
	this.checkbox2();



	}

}
