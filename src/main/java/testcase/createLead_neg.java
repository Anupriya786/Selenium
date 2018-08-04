package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.myHomepage;
import testNG.Annotations;

public class createLead_neg extends Annotations{
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead_neg";
		testName = "CreateLead_neg_Excel";
		testDesc="Create a Lead";
		category= "sanity";
		author="anu";
		moduleName="leads";
	}
	

	@Test(dataProvider="fetchData")
	public void createnewLead(String fname,String lname,String compname,String errorText) {
		 
		new myHomepage()
		.clickLeads()
		.clickcreateLeads()
		.typefirstname(fname)
		.typelastname(lname)
		.typecompname(compname)
		.clicksubmit_neg()
		.verifyErrorMsg(errorText);
	
	
	}
}
