package week3Day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryIt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// progeram to Select the last but one option in any of the dropdown @http://testleaf.herokuapp.com/pages/Dropdown.html
		//Load the URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//html/body/button").click();
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys("Anupriya");
		Thread.sleep(3000);
		System.out.println(myAlert);
		Thread.sleep(3000);
		myAlert.accept();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@id='tryhome']").click();
		driver.close();
		
		
		

	}

}
