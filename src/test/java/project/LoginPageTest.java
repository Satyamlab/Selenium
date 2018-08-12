package project;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import baseClass.Base;

public class LoginPageTest extends Base {
		
	LoginPage lp;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException{
		initialisation();
		lp = new LoginPage();	
	}
	
	@Test
	public void login() throws IOException{
	
	/*HomePage = lp.login("","");
	*/
	}
	
}
