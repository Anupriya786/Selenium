package week4Day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElementByXPath("//div[text()='x']").click();
		driver.findElementByXPath("//div[text()='NetBanking']").click();
		Thread.sleep(10000);
		//driver.findElementByXPath("//li[text()='Prepaid/ Forex Card']").click();
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.switchTo().frame("login_page");	
//		WebElement ele = driver.findElementByXPath("//span[@class='pwd_field']/input");
//		ele.click();
//		Thread.sleep(3000);
//		ele.sendKeys("1a22");
		driver.findElementByXPath("//li[text()='Prepaid/ Forex Card']").click();
		
	
		

	}

}
