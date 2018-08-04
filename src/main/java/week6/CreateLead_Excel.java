package week6;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNG.Annotations;
import wdMethods.SeMethods;

public class CreateLead_Excel extends Annotations{

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
	public void createLead(String fname,String lname,String cname) throws InterruptedException {
		
		WebElement elecreatelead = locateElement("linktext","Create Lead");
		click(elecreatelead);
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname, fname);
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname, lname);
		WebElement elecomname = locateElement("id","createLeadForm_companyName");
		type(elecomname, cname);
		WebElement elecreateleadbut = locateElement("classname", "smallSubmit");
		click(elecreateleadbut);
		
	}
	
	
}
	







