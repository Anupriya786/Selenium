package week4Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement eledrag = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement eledrop = driver.findElementByXPath("//ul[@id='sortable']/li[5]");
		int x= eledrop.getLocation().getX();
		int y= eledrop.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eledrag, x,y).perform();
	}

}
