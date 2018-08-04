package week2Day2Homework;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUpPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		driver.findElementById("userRegistrationForm:userName").sendKeys("Anupriya");
		driver.findElementById("userRegistrationForm:password").sendKeys("Anu@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Anu@123");
		// Security Question
		WebElement DDSecQuesSource = driver.findElementById("userRegistrationForm:securityQ");
		Select objSecQusDD = new Select(DDSecQuesSource);
		objSecQusDD.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Rockey");
		WebElement selectLanguage = driver.findElementById("userRegistrationForm:prelan");
		Select sl = new Select(selectLanguage);
		List<WebElement> sel = sl.getOptions();
		int sizee = sel.size();
		System.out.println(sizee);
		for (WebElement eachopt : sel) {
			String text = eachopt.getText();
			System.out.println(text);
		}
		sl.selectByValue("en");
		// First,Middle and Last Name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Anu");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("priya");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Bhaskar");
		// Gender
		driver.findElementById("userRegistrationForm:gender:0").click();
		// Marital Status
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		driver.findElementByName("userRegistrationForm:j_idt502");

		// DOB
		WebElement DDobDay = driver.findElementById("userRegistrationForm:dobDay");
		WebElement DDobMonth = driver.findElementById("userRegistrationForm:dobMonth");
		WebElement DDobYear = driver.findElementById("userRegistrationForm:dateOfBirth");

		Select objDDobDay = new Select(DDobDay);
		objDDobDay.selectByValue("25");

		Select objDDobMonth = new Select(DDobMonth);
		objDDobMonth.selectByValue("12");

		Select objDDobYer = new Select(DDobYear);
		objDDobYer.selectByValue("1993");

		// Occupational
		WebElement DDOccupay = driver.findElementById("userRegistrationForm:occupation");
		Select objDDOccupay = new Select(DDOccupay);
		objDDOccupay.selectByValue("3");

		// Country
		WebElement DDCountry = driver.findElementById("userRegistrationForm:countries");
		Select objDDCountry = new Select(DDCountry);
		objDDCountry.selectByValue("94");

		// Email
		driver.findElementById("userRegistrationForm:email").sendKeys("anupriyadreams786@gmail.com");

		// Mobile
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9098088734");

		// AadaarCard
		driver.findElementById("userRegistrationForm:uidno").sendKeys("315187470767");

		// PanCard
		driver.findElementById("userRegistrationForm:idno").sendKeys("1234455");

		// Nationality
		WebElement DDONational = driver.findElementById("userRegistrationForm:nationalityId");
		Select objDDNational = new Select(DDONational);
		objDDNational.selectByValue("94");

		// Address ,Street and Area
		driver.findElementById("userRegistrationForm:address").sendKeys("abcderadsfasdfadsfsadfsadf");
		driver.findElementById("userRegistrationForm:street").sendKeys("adsj");
		driver.findElementById("userRegistrationForm:area").sendKeys("adfasd");

		// PinCode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("842001", Keys.TAB);

		// City
		Thread.sleep(5000);
		WebElement DDCity = driver.findElementById("userRegistrationForm:cityName");
		Select objDDCity = new Select(DDCity);
		objDDCity.selectByValue("Muzaffarpur");
		driver.findElementById("userRegistrationForm:cityName").sendKeys(Keys.TAB);

		// PostOffice
		Thread.sleep(5000);
		WebElement DDPostOff = driver.findElementById("userRegistrationForm:postofficeName");
		Select objDDPostOff = new Select(DDPostOff);
		objDDPostOff.selectByValue("Pakki Sarai S.O");

		// LandLine
		driver.findElementById("userRegistrationForm:landline").sendKeys("0442547810365");

		System.out.println("Values Successfully inserted");

	}

}
