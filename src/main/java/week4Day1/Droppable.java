package week4Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement eledrag = driver.findElementByXPath("//div[@id='draggable']");
		WebElement eledrop = driver.findElementByXPath("//div[@id='droppable']");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eledrag, eledrop).perform();
	}

}
