package ProjectDay;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateContactSeMethods extends SeMethods {

	@Test
	public void createContact() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement elelink = locateElement("linktext","CRM/SFA");
		click(elelink);
		WebElement elCrCon = locateElement("linktext","Create Contact");
		click(elCrCon);
		WebElement elfirstnm = locateElement("id","firstNameField");
		type(elfirstnm, "Anu");
		WebElement ellstnm = locateElement("id","lastNameField");
		type(ellstnm, "Priya");
		WebElement elfslocal = locateElement("id","createContactForm_firstNameLocal");
		type(elfslocal, "Silky");
		WebElement eleTo = locateElement("id","generalToNameField");
		String toName = getAttribute(eleTo, "value");
		/*
		WebElement eltitle = locateElement("id","createContactForm_personalTitle");
		type(eltitle, "Ms");
		WebElement elpro = locateElement("id","createContactForm_generalProfTitle");
		type(elpro, "CreateContact");
		WebElement eldpt = locateElement("id","createContactForm_departmentName");
		type(eldpt, "Health");
		WebElement ddcurr = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingValue(ddcurr,"INR");
		WebElement eldpes = locateElement("id","createContactForm_description");
		type(eldpes, "Create Conatct description");
		WebElement elimp = locateElement("id","createContactForm_importantNote");
		type(elimp, "Pair Programming");
		WebElement elcode = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(elcode, "91");
		WebElement elex = locateElement("id","createContactForm_primaryPhoneExtension");
		type(elex, "044");
		WebElement elemail = locateElement("id","createContactForm_primaryEmail");
		type(elemail, "anupriyadreams786@gmail.com");
		WebElement eleph = locateElement("id","createContactForm_primaryPhoneNumber");
		type(eleph, "9098088734");
		WebElement eleask = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(eleask, "Abhi");
		
		System.out.println(toName);
		WebElement elead1 = locateElement("id","createContactForm_generalAddress1");
		type(elead1, "18 A,G1 floor, Alpha Homes, Manikanan Street");
		WebElement elecity = locateElement("id","createContactForm_generalCity");
		type(elecity, "Chennai");
		WebElement elepst = locateElement("id","createContactForm_generalPostalCode");
		type(elepst, "600091");
		WebElement elepstex = locateElement("id","createContactForm_generalPostalCodeExt");
		type(elepstex, "002");
		WebElement eleAtt = locateElement("id","createContactForm_generalAttnName");
		type(eleAtt, "AP");
		WebElement elead2 = locateElement("id","createContactForm_generalAddress2");
		type(elead2, "Madipakkam");
		WebElement elecoun = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(elecoun,"India");
		Thread.sleep(2000);
		WebElement elest = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(elest,"TAMILNADU");*/
		WebElement elesub = locateElement("xpath","//input[@class='smallSubmit']");
		click(elesub);
		WebElement eleFN = locateElement("id","viewContact_fullName_sp");
		String FN = getText(eleFN);
		
		System.out.println(FN);
		verifyPartialAttribute(eleFN, toName, "Anu Priya");
		WebElement eleEdit = locateElement("linktext", "Edit");
		click(eleEdit);
		WebElement elemar = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(elemar,"eCommerce Site Internal Campaign");
		String mar = getText(elemar);
		WebElement eleadd = locateElement("xpath","//input[@value='Add']");
		click(eleadd);
		WebElement eleup = locateElement("xpath","//input[@value='Update']");
		click(eleup);
		WebElement elemar1 = locateElement("id","viewContact_marketingCampaigns_sp");
		getText(elemar1);
		verifyExactText(elemar1, mar);
		
		
}
}
