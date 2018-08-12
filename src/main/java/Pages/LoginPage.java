package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;
import freemarker.core.ReturnInstruction.Return;

public class LoginPage extends Base {

	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;

	
	public void LoginPage() throws IOException, InterruptedException{
	PageFactory.initElements(driver, this);	
	
	}
	
	public HomePage login(String un, String pwd ) throws IOException{
	
	username.sendKeys(un);
	password.sendKeys(pwd);
	submit.click();
	return new HomePage();
	}
	
}
