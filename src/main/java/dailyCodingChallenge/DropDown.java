package dailyCodingChallenge;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// progeram to Select the last but one option in any of the dropdown @http://testleaf.herokuapp.com/pages/Dropdown.html
		//Load the URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown1']/following::div/select"));
		//create an object using selevt class for the webelement
		Select dd = new Select(drop);
		//get all the list of webelement from the dropdown and store it
		List<WebElement> sel = dd.getOptions();
		//get number of webelements
		int siz = sel.size();
		//print the size of
		System.out.println(siz);
		//select the last but one from the dropdown
		dd.selectByIndex(siz-2);
	}

}
