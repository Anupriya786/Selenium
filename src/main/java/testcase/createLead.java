package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.myHomepage;
import testNG.Annotations;

public class createLead extends Annotations{
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead";
		testName = "CreateLead_Excel";
		testDesc="Create a Lead";
		category= "smoke";
		author="anu";
		moduleName="leads";
	}
	

	@Test(dataProvider="fetchData")
	public void createnewLead(String fname,String lname,String compname,String expectedText) {
		 
		new myHomepage()
		.clickLeads()
		.clickcreateLeads()
		.typefirstname(fname)
		.typelastname(lname)
		.typecompname(compname)
		.clicksubmit()
		.verifyfirstname(expectedText);
	
	
	}
}
