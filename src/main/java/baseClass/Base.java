package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public static void initialisation() throws IOException, InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");

	driver = new ChromeDriver();
	
	driver.get(Property("Url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	
	
	public static String Property(String data) throws IOException{
	prop =new Properties();
	FileInputStream fis = new FileInputStream("F:\\Selenium\\New folder\\project\\src\\main\\resources\\Variables.Properties");
	prop.load(fis);
	String value = prop.getProperty(data);
	
	return value;
	}
	
}
