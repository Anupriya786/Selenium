package week3Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// progeram to Select the last but one option in any of the dropdown @http://testleaf.herokuapp.com/pages/Dropdown.html
		//Load the URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys("Anupriya");
		//System.out.println(myAlert.getText());
		myAlert.accept();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@id='tryhome']").click();
	    Set<String> allWindowHandle = driver.getWindowHandles();
	    List<String> listOfAllWindowHandle = new ArrayList<String>();
	    listOfAllWindowHandle.addAll(allWindowHandle);
	   System.out.println(driver.getCurrentUrl()); 
	   System.out.println(driver.getTitle()); 
	   driver.switchTo().window(listOfAllWindowHandle.get(2));
	   System.out.println(driver.getCurrentUrl()); 
	   System.out.println(driver.getTitle()); 
	   driver.quit();
	   
	    
		
	}

}
