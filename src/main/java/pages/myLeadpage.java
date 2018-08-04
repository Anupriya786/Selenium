package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Annotations;

public class myLeadpage extends Annotations {
	
	public myLeadpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement elecreateLeads;
	
	public createLeadpage clickcreateLeads() {
		click(elecreateLeads);
		return new createLeadpage();
	}

}
