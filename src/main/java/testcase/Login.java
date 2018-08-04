package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG.Annotations;

public class Login extends Annotations{
@Test(dataProvider= "fetchData")
	//@Test(groups= {"smoke"})
	public void login(String fName,String lName,String cName, int ph) {
	
		WebElement elecreatelead = locateElement("linktext", "Create Lead");
		click(elecreatelead);
		WebElement elefirstname = locateElement("id", "createLeadForm_firstName");
		type(elefirstname,fName);
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname, lName);
		WebElement companyname = locateElement("id","createLeadForm_companyName");
		type(companyname, cName);
		WebElement phonenumber = locateElement("xpath","//input[@id='createLeadForm_primaryPhoneNumber']");
		type(phonenumber, ""+ph);
		//WebElement eleindus = locateElement("id","createLeadForm_industryEnumId");
		//type(eleindus, "INSURANCE");
		WebElement submit = locateElement("classname","smallSubmit");
		click(submit);
//		WebElement findlead = locateElement("linktext","Find Leads");
//		click(findlead);
//		WebElement clickphone = locateElement("xpath","//span[text()='Phone']");
//		click(clickphone);
//		WebElement enterareacode = locateElement("xpath","//input[@name='phoneAreaCode']");
//		type(enterareacode, "2");
//		WebElement findphonenumber = locateElement("name","phoneNumber");
//		type(findphonenumber, "9098088734");
//		WebElement elefindlead = locateElement("xpath","//button[text()='Find Leads']");
//		click(elefindlead);
		
		
		
		
		
		
		
		
	}
@DataProvider(name="fetchData")
public Object[][] getData(){
		 
	Object[][] data = new Object[2][4];
	
	data[0][0]="Anu";
	data[0][1]="B";
	data[0][2]="TestLeaf";
	data[0][3]=123456789;
	

	data[1][0]="Sarath";
	data[1][1]="M";
	data[1][2]="TL";
	data[1][3]=123456799;
	return data;
	
}
	
}






