package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Annotations;

public class viewLeadpage extends Annotations {
	
	public viewLeadpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement firstname;
	
	public viewLeadpage verifyfirstname(String expectedText) {
		verifyExactText(firstname, expectedText);
		return this;
	}

}
