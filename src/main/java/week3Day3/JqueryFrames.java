package week3Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// load url
		driver.get("https://layout.jquery-dev.com/demos/iframes_many.html");
		int nfr = driver.findElements(By.xpath("//iframe")).size();
		System.out.println("Total frames = " + nfr);
		driver.switchTo().defaultContent();
		WebDriver fr1 = driver.switchTo().frame(0);
		int size=driver.findElementsByTagName("iframe").size();
		System.out.println("Total Frames inside frame1 is " + size);
		driver.switchTo().defaultContent();
		WebDriver fr2 = driver.switchTo().frame(1);
		int size1=driver.findElementsByTagName("iframe").size();
		System.out.println("Total Frames inside frame2 is " + size1);
		driver.switchTo().defaultContent();
		WebDriver fr3 = driver.switchTo().frame(2);
		int size2=driver.findElementsByTagName("iframe").size();
		System.out.println("Total Frames inside frame3 is " + size2);
		driver.switchTo().defaultContent();
		WebDriver fr4 = driver.switchTo().frame(2);
		int size3=driver.findElementsByTagName("iframe").size();
		System.out.println("Total Frames inside frame3 is " + size3);
		driver.switchTo().defaultContent();
		WebDriver fr5 = driver.switchTo().frame(2);
		int size4=driver.findElementsByTagName("iframe").size();
		System.out.println("Total Frames inside frame3 is " + size4);
	
		driver.close();
	
		
	}

}
