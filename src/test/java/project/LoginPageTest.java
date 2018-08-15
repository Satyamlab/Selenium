package project;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.Calender;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.companies;
import baseClass.Base;

public class LoginPageTest extends Base {
		
	LoginPage lp;
	HomePage hp;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException{
		initialisation();
		lp = new LoginPage();	
	}
	
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		long threadId = Thread.currentThread().getId();
		System.out.println(threadId);
	hp = lp.login(Property("Username"),Property("Password"));
	
	}
	
	
	@AfterMethod
	public void close(){
		driver.close();
	}
	
	
}
