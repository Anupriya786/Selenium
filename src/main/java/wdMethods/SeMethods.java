package wdMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import week5.Reporter;

public class SeMethods extends Reporter implements WdMethods{
	public static RemoteWebDriver driver;
	int i = 1;
	public static Properties prop;
	 //Actions builder = new Actions(driver);

	public void loadObject() throws FileNotFoundException, IOException {
		 prop = new Properties();
		prop.load(new FileInputStream("./src/main/resources/object.properties"));
	}
	
	 //Actions builder = new Actions(driver);

	public void startApp(String browser, String url){
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  System.out.println("The Browser " + browser + " is Launched Successfully");
			//reportStep("The Browser " + browser + " is Launched Successfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println("Exception has Occurred");
			reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		
		finally {
			takeSnap();	
		}
		
		

	}

	public WebElement locateElement(String locator, String locValue)  {
		try {
			switch (locator) {
			case "id":
				return driver.findElementById(locValue);
			case "class":
				return driver.findElementByClassName(locValue);
			case "xpath":
				return driver.findElementByXPath(locValue);
			case "linktext":
				return driver.findElementByLinkText(locValue);
			case "name":
				return driver.findElementByName(locValue);
			case "classname":
				return driver.findElementByClassName(locValue);
			}
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println("Exception has Occurred");
			reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		finally {
		
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) throws NullPointerException {
		try {
			ele.sendKeys(data);
			System.out.println("The Data " + data + " is Entered Successfully");
			//reportStep("The Data " + data + " is Entered Successfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			 System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("Exception has Occurred");
			//reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
		}
		finally {
		takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
		    System.out.println("The Element " + ele + " is clicked Successfully");
			//reportStep("The Element " + ele + " is clicked Successfully","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			//reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = ele.getText();
			System.out.println("The Entered Text is " + text);
			//reportStep("The Entered Text is ","pass");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			 System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		return text;
	}
	
	public String getAttribute(WebElement ele,String data) {
		String text = null;
		// TODO Auto-generated method stub
		try {
			 text = ele.getAttribute(data);
			 System.out.println("The text is "+text);
			//reportStep("The text is "+text,"pass");
		} catch (Exception e) {
			 System.out.println("WebDriver Exception has Occurred");
			 //reportStep("WebDriver Exception has Occurred","fail");
		}
		finally
		{
		takeSnap();
		}
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
			System.out.println("The value Slected in the Element is " + value);
			//reportStep("The value Slected in the Element is " + value,"pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			 System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			//reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}
	}
	
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		 try {
			Select dd = new Select(ele);
			 dd.selectByValue(value);
			 System.out.println("Value selected from dropdown");
			 //reportStep("Value selected from dropdown","pass");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//reportStep("Exception has Occurred","fail");
			System.out.println("Exception has Occurred");
		}
		 finally
		 {
		 takeSnap();
	}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

		try {
			Select dd = new Select(ele);
			dd.selectByIndex(index);
			System.out.println("The value Slected in the Element is " + index);
			//reportStep("The value Slected in the Element is " + index,"pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			//reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		boolean bReturn = false;
		try {
			if (driver.getTitle().equals(expectedTitle)) {
				System.out.println("Expected Title is matched Successfully");
				//reportStep("Expected Title is matched Successfully","pass");
				bReturn = true;
			} else {
				System.out.println("Expected Title is Not Matched");
				//reportStep("Expected Title is Not Matched","pass");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
			//reportStep("WebDriver Exception has Occurred","fail");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("Exception has Occurred");
			//reportStep("Exception has Occurred","fail");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}
		return bReturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if (ele.getText().contains(expectedText)) {
				System.out.println("Expected Text is matched");
			} else {
				System.out.println("Expected Text is not matched");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * String text1=ele.getText(); if(expectedText.equalsIgnoreCase(text1)){
		 * System.out.println("The text" + text1+ "is verified Successfully"); }
		 */

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text1 = ele.getText();
		if (expectedText.contains(text1)) {
			System.out.println("The text" + text1 + "is partially verified Successfully");
		} else {
			System.out.println("The text" + text1 + "is not partially verified");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		try {
			if (ele.getAttribute(attribute).equals(value)) {
				System.out.println("The attribute" + value + "is not exact verified Successfully");
			} else {
				System.out.println("The attribute" + value + "is not exact verified");
			}
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		try {
			value = value.replaceAll("^a-zA-Z]","");
		
			if (ele.getAttribute(attribute).contains(value)) {
				System.out.println("The attribute" + value + "is partially verified Successfully");
			} else {
				System.out.println("The attribute" + value + "is not partially verified");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			//throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			if (ele.isSelected()) {
				System.out.println(ele + "The element is Selected");
			} else {
				System.out.println(ele + "The element is not Selected");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			if (ele.isDisplayed()) {
				System.out.println(ele + "The element is Displayed");
			} else {
				System.out.println(ele + "The element is not Displayed");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception has Occurred");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}

	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> listOfWindows = new ArrayList();
			listOfWindows.addAll(allWindows);
			driver.switchTo().window(listOfWindows.get(index));
		} 
		catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has Occurred");
			throw new RuntimeException();
			
		}
		finally {
		takeSnap();
		}

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.out.println("No such Frame Found");
		}

	}
	public void switchToAlert() {
		try {
			driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.out.println("No such more Alert to Switch");
		}
	}
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Alert Accepted");
		}

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Alert Dismiss");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub

		try {
			return driver.switchTo().alert().getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not get Any Text from Alert");
			
		}
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			System.out.println("Not possible to take Snapshot for Alert");
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	public void maximize() {
		driver.manage().window().maximize();
		takeSnap();
	}
	
	public void mouseOver(WebElement source, WebElement target) {
		Actions builder = new Actions(driver);
		builder.moveToElement(source).pause(2000).click(target).perform();
	}
	
	
	
	public int StringtoNum(String a) {
		String replace=a.replaceAll("₹","").replaceAll(",","");
		int parse = Integer.parseInt(replace);
		System.out.println(parse);
		return parse;
	}
	
	public void compare2Values(int a,int b) {
		if(a<b) {
			System.out.println("price of a is smaller");
	}
		else
		{
			System.out.println("price of b is smaller");
		}
	
	}
}



