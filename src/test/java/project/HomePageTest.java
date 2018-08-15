package project;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.companies;
import baseClass.Base;

public class HomePageTest extends Base{

	LoginPage lp;
	HomePage hp;
	companies comp;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException{
		initialisation();
		lp = new LoginPage();
		hp = lp.login(Property("Username"),Property("Password"));
		comp = new companies();
	}
	
	@Test
	public void Homepage()
	{
		long threadId = Thread.currentThread().getId();
		System.out.println(threadId);
		hp.QuickCreate();		
		comp.companiesLink();
		comp.verifyEntry("Icertis");
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}
}
