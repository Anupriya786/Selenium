package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testNG.Annotations;

public class createLeadpage extends Annotations {
	
	public createLeadpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement elefname;
	@FindBy(id="createLeadForm_lastName")
	WebElement elelname;
	@FindBy(id="createLeadForm_companyName")
	WebElement elecname;
	@FindBy(className="smallSubmit")
	WebElement elesubmit;
	@FindBy(className="errorMessage")
	WebElement eleErrorMsg;
	
	public createLeadpage typefirstname(String fname) {
		type(elefname, fname);
		return this;
		
	}
	public createLeadpage typelastname(String lname) {
		type(elelname, lname);
		return this;
	}
	public createLeadpage typecompname(String compname) {
		type(elecname, compname);
		return this;
	}
	public viewLeadpage clicksubmit() {
		click(elesubmit);
		return new viewLeadpage();
	}
	public createLeadpage clicksubmit_neg() {
		click(elesubmit);
		return this;
	}
		public createLeadpage verifyErrorMsg(String errorText) {
			verifyPartialText(eleErrorMsg, errorText);
			return this;
		}
	
	
	
	
}

