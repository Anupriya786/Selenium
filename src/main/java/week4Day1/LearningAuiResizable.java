package week4Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningAuiResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		//WebElement eledrag = driver.findElementByXPath("//div[@id='resizable']/h3[text()='Resizable']");
		WebElement eledrop = driver.findElementByXPath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']");
		Actions builder = new Actions(driver);
		int y=eledrop.getLocation().getY();
		builder.dragAndDropBy(eledrop, 0,y+10).perform();

	}

}
