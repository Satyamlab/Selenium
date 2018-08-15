package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class companies extends Base {

	@FindBy(xpath="//form[contains(@id,'vCompaniesForm')]")
	WebElement CompaniesTable;

	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement companiesLink;

	
public companies(){
	PageFactory.initElements(driver, this);
	
}

public void companiesLink(){
	companiesLink.click();
}

public void verifyEntry(String CompanyName){
	WebElement table = CompaniesTable.findElement(By.xpath("//a[contains(text(),'"+CompanyName+"')]"));
}



}
