package CreateLead_Cucumber_Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	ChromeDriver driver;
@Given("Open the browser")
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     driver = new ChromeDriver();
}

@And("Maximise the window")
public void max() {
driver.manage().window().maximize();
}

@And("Load the URL")
public void loadURL() {
	driver.get("http://leaftaps.com/opentaps");
}

@And("Set the Timeout")
public void setTimeout() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@And("Enter the username as (.*)")
public void enterUsername(String Uname) {
	driver.findElementById("username").sendKeys(Uname);
}

@And("Enter the password as (.*)")
public void enterpwd(String pwd) {
	driver.findElementById("password").sendKeys(pwd);
}

@And("Click on Login button")
public void clickLogin() {
	driver.findElementByClassName("decorativeSubmit").click();
}

@And("Click on CRMSFA link")
public void clickLink() {
	driver.findElementByXPath("(//div[@id='label']/a)[1]").click();
}

@And("Click on Create Lead")
public void clickCreateLeadlink() {
	driver.findElementByLinkText("Create Lead").click();
}

@And("Enter the first name (.*)")
public void firstName(String fName) {
	//driver.findElementById("createLeadForm_firstName").sendKeys("Anu");
	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
    
}
@And("Enter the last name (.*)")
public void lastName(String lName) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
    
}
@And("Enter the company name (.*)")
public void compName(String compName) {
	driver.findElementById("createLeadForm_companyName").sendKeys(compName);
    
}

@When("Click on Create Lead button")
public void clickCreateleadbutton() {
	driver.findElementByClassName("smallSubmit").click();
}

@Then("Verify create lead is successful")
public void verifyCreateLead() {
	System.out.println("Create Lead is successful");
}
@Then("Create lead is not successful")
public void negativeCreateLead() {
	System.out.println("Create Lead is not successful");
}
}
