package pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Annotations;

public class myHomepage extends Annotations {
	
	public myHomepage() {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(linkText="Leads")
	//WebElement eleLeads;
	
	
	public myLeadpage clickLeads() {
		WebElement eleLeads = locateElement("linktext", prop.getProperty("myHomepage.leads.link"));
		click(eleLeads);
		return new myLeadpage();
	}
	
}
