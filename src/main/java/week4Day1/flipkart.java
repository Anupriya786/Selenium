package week4Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElementByXPath("//button[text()='✕']").click();
		//Menu
		WebElement eleTvsApple = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		//SubMenu
		WebElement eleAC = driver.findElementByXPath("(//a//span[text()='Samsung'])[2]");
		//Actions Performed
		Actions builder = new  Actions(driver);
		builder.moveToElement(eleTvsApple).pause(3000).click(eleAC).perform();
		
	
	}

}
