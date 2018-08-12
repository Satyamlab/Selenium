package project;

import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{

@Test
public void test() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");

ChromeDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("test");
Thread.sleep(3000);
List<WebElement> a = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
System.out.println(a.size());
System.out.println(a.get(1).getText());

for(int i=1;i<a.size();i++)
{
	System.out.println(a.get(i).getText());
	if(a.get(i).getText().equals("test tube baby"))
	{
		a.get(i).click();
		break;
	}
	}
	}
 
 
 {
	 
}
}

