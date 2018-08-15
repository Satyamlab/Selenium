package Pages;

import static org.testng.Assert.assertEquals;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import baseClass.Base;

public class HomePage extends Base {

	
	@FindBy(xpath="//td[contains(text(),'User: satyam gupta')]")
	WebElement usernamelabel;
	
	@FindBy(xpath="//table[contains(@class,'crmcalendar')]")
	WebElement calender;
	
	@FindBy(xpath="//input[contains(@name,'company_name')]")
	WebElement company;
	
	@FindBy(xpath="//input[contains(@name,'contact_first_name')]")
	WebElement firstname;
	
	@FindBy(xpath="//input[contains(@name,'contact_surname')]")
	WebElement Lastname;
	
	@FindBy(xpath="//input[contains(@value,'Create')]")
	WebElement create;
	
	@FindBy(xpath="//frame[contains(@name,'mainpanel')]")
	WebElement mainpanel;
	
	public HomePage() throws InterruptedException{
		PageFactory.initElements(driver, this);	
		Thread.sleep(5000);
		driver.switchTo().frame(mainpanel);
	}
	
	
	public void VerifyHome(){
		
		String actual =usernamelabel.getText().trim();
	}
	
	public WebElement Calender(){
		return	calender;
	}
	
	public void setdate(String Month,int Year,int date) throws InterruptedException{
	Thread.sleep(3000);
	driver.switchTo().frame(mainpanel);
	com.utility.Calender cal = new com.utility.Calender();
	cal.SelectDate(Month,Year, date);
	}
	
	public companies QuickCreate() {
		firstname.sendKeys("Satyam");
		Lastname.sendKeys("Gupta");
		company.sendKeys("Icertis");
		create.click();
		
	return new companies();
	}
	
	
}
