package ProjectDay;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testleaf//chromedriver.exe");
    ChromeDriver obj = new ChromeDriver();
    obj.get("http://leaftaps.com/opentaps");
    obj.manage().window().maximize();
    obj.findElementById("username").sendKeys("demosalesmanager");
    obj.findElementById("password").sendKeys("crmsfa");
    obj.findElementByClassName("decorativeSubmit").click();
    obj.findElementByLinkText("CRM/SFA").click();
    obj.findElementByLinkText("Create Contact").click();
    obj.findElementById("firstNameField").sendKeys("Abhinaya");
    obj.findElementById("lastNameField").sendKeys("Babu");
    obj.findElementById("createContactForm_firstNameLocal").sendKeys("Abhi");
    obj.findElementById("createContactForm_lastNameLocal").sendKeys("Sumi");
    obj.findElementById("createContactForm_personalTitle").sendKeys("Ms");
    obj.findElementById("createContactForm_generalProfTitle").sendKeys("CreateContact");
    obj.findElementById("createContactForm_departmentName").sendKeys("Health");
    WebElement curr = obj.findElementById("createContactForm_preferredCurrencyUomId");
    Select dd = new Select(curr);
    dd.selectByValue("INR");
    obj.findElementById("createContactForm_description").sendKeys("Create Conatct description");
    obj.findElementById("createContactForm_importantNote").sendKeys("Pair programming");
    obj.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("91");
    obj.findElementById("createContactForm_primaryPhoneExtension").sendKeys("044");
    obj.findElementById("createContactForm_primaryEmail").sendKeys("abi@gmail.com");
    obj.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9874327345");
    obj.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Anu");
    String text = obj.findElementById("generalToNameField").getText();
    System.out.println(text);
    obj.findElementById("createContactForm_generalAddress1").sendKeys("F501");
    obj.findElementById("createContactForm_generalCity").sendKeys("Chennai");
    obj.findElementById("createContactForm_generalPostalCode").sendKeys("603204");
    obj.findElementById("createContactForm_generalPostalCodeExt").sendKeys("001");
    obj.findElementById("createContactForm_generalAttnName").sendKeys("AAA");
    obj.findElementById("createContactForm_generalAddress2").sendKeys("Akshaya");
    WebElement coun = obj.findElementById("createContactForm_generalCountryGeoId");
    Select dd1= new Select(coun);
    dd1.selectByVisibleText("India");
    Thread.sleep(2000);
    WebElement State = obj.findElementById("createContactForm_generalStateProvinceGeoId");
    		Select dd2= new Select (State);
    dd2.selectByVisibleText("TAMILNADU");
    obj.findElementByXPath("//input[@class='smallSubmit']").click();
    String vername = obj.findElementById("viewContact_fullName_sp").getText();
    if(vername.contains(text)) {
    	System.out.println("First Name is matching and verified");
    }
    else
    {
    	System.out.println("First Name is not matching");
    }
    obj.findElementByLinkText("Edit").click();
    WebElement market = obj.findElementById("addMarketingCampaignForm_marketingCampaignId");
    Select dd3 = new Select(market);
    dd3.selectByVisibleText("eCommerce Site Internal Campaign");
    String oldval = "eCommerce Site Internal Campaign";
    System.out.println(oldval);
    obj.findElementByXPath("//input[@value='Add']").click();
    obj.findElementByXPath("//input[@value='Update']").click();
    String newval = obj.findElementById("viewContact_marketingCampaigns_sp").getText();
    System.out.println(newval);
    if (newval.equals(oldval))
    {
    	System.out.println("Value is matching");
    }
    else
    {
    	System.out.println("Value is not matching");
    }
	}
}
