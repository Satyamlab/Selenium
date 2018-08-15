package com.utility;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pages.HomePage;
import baseClass.Base;

public class Calender extends Base {

	public void SelectDate(String Month,int Year,int date) throws InterruptedException{
	
	HomePage hp = new HomePage();
	WebElement calender = hp.Calender();
	Select selectMonth = new Select(calender.findElement(By.xpath("//select[@name='slctMonth']")));
	selectMonth.selectByVisibleText(Month);
	
	Select selectYear = new Select(calender.findElement(By.xpath("//select[@name='slctYear']")));
	selectYear.selectByVisibleText("Year");
	calender.findElement(By.xpath("//*[Contains(text(),'"+date +"']")).click();;
	
	
	
	}
}
