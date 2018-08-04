package week3Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcContactUs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// load url
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//driver.get("http://contents.irctc.co.in/en/CompatibleBrowser.html");
		
		System.out.println("The Current Title is" + driver.getTitle());
		System.out.println("The Current Url is" + driver.getCurrentUrl());
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> sUpdateWindow = driver.getWindowHandles();
		List<String> sListsUpdateWindow = new ArrayList<String>();
		sListsUpdateWindow.addAll(sUpdateWindow);
		driver.switchTo().window(sListsUpdateWindow.get(1));
		System.out.println("The Current Title is" + driver.getTitle());
		System.out.println("The Current Url is" + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(sListsUpdateWindow.get(0));
		driver.findElementByLinkText("Compatible Browser").click();

		Set<String> comWindow = driver.getWindowHandles();
		List<String> comUpdateWindow = new ArrayList<String>();
		comUpdateWindow.addAll(comWindow);
		driver.switchTo().window(comUpdateWindow.get(1));
		System.out.println("The Current Title is" + driver.getTitle());
		System.out.println("The Current Url is" + driver.getCurrentUrl());
		
		List<WebElement> selBrowser = driver.findElementsByXPath("//div[@class='content_12']//li");
		System.out.println(selBrowser.size());
		for (WebElement allBrowser : selBrowser) {
			System.out.println(allBrowser.getText());
		}

		driver.quit();
	}

}
