package week2Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		//ChromeOptions opt=new ChromeOptions();
		//opt.setHeadless(true);
		//ChromeDriver driver=new ChromeDriver(opt);
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("demosalesmanager");
		//WebElement user = driver.findElementById("username");
		//user.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		/*
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//div[@id=\"label\"]/a").click();
		//driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//div[@class=\"frameSectionBody\"]/ul/li[1]/a[text()='Create Lead']").click();
		driver.findElementById("createLeadForm_firstName").sendKeys("Anu");
		driver.findElementById("createLeadForm_lastName").sendKeys("Priya");
		driver.findElementById("createLeadForm_companyName").sendKeys("ALW");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9098088734");
		WebElement indus = driver.findElementById("createLeadForm_industryEnumId");
		Select dd= new Select(indus);
		List<WebElement> all = dd.getOptions();
		int size = all.size();
		System.out.println(size);
		for(WebElement eachopt : all) {
			String text = eachopt.getText();
			System.out.println(text);
		}
		dd.selectByValue("IND_INSURANCE");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByXPath("//div[@class=\"frameSectionBody\"]/ul/li[3]/a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//div[@class=\"x-tab-strip-wrap\"]/ul/li[2]/a[@class=\"x-tab-right\"]/em[@class=\"x-tab-left\"]/span[1]/span").click();
		driver.findElementByName("phoneAreaCode").sendKeys("2");
		driver.findElementByName("phoneNumber").sendKeys("9098088734");
		driver.findElementByXPath("//button[text()='Find Leads']").click();*/
		//driver.findElementById("ext-gen341").click();
		
		//driver.findElementByName("submitButton").click();
	}

}
