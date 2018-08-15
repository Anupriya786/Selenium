package ProjectDay;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

		public class Flipkart extends SeMethods {

		@Test
		public void CreateContact() {
			startApp("chrome", "https://www.flipkart.com/");
			WebElement elex = locateElement("xpath", "//button[text()='✕']");
			click(elex);
			WebElement elemenu = locateElement("xpath", "//span[text()='TVs & Appliances']");
			WebElement elesubmenu = locateElement("xpath", "(//a[text()='Samsung'])[2]");
			mouseOver(elemenu, elesubmenu);
			WebElement elemin = locateElement("xpath", "(//select[@class='fPjUPw'])[1]");
			selectDropDownUsingText(elemin,"₹25000");
			WebElement elemax = locateElement("xpath", "(//select[@class='fPjUPw'])[2]");
			selectDropDownUsingText(elemax, "₹60000");
			WebElement eless = locateElement("xpath","//div[text()='Screen Size']");
			click(eless);
			WebElement elessvalue = locateElement("xpath", "//div[text()='48 - 55']");
			click(elessvalue);
			WebElement ele1stlink = locateElement("xpath" , "//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
			click(ele1stlink);
			switchToWindow(1);
			WebElement elecomp1 = locateElement("xpath", "(//div[@class='_1p7h2j'])[1]");
			click(elecomp1);
			closeBrowser();
			switchToWindow(0);
			WebElement ele2ndlink = locateElement("xpath" , "//div[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
			click(ele2ndlink);
			switchToWindow(1);
			WebElement elecomp2 = locateElement("xpath", "(//div[@class='_1p7h2j'])[1]");
			click(elecomp2);
			WebElement elefinalcomp = locateElement("xpath", "//span[text()='COMPARE']");
			click(elefinalcomp);
			WebElement eleprice1 = locateElement("xpath", "(//div[text()='₹56,999'])[1]");
			String price1 = getText(eleprice1);
			WebElement eleprice2 = locateElement("xpath", "(//div[text()='₹39,999'])[1]");
			String price2 = getText(eleprice2);
			int p1 = StringtoNum(price1);
			int p2 = StringtoNum(price2);
			compare2Values(p1,p2);
			WebElement buynow = locateElement("xpath", "(//button[text()='BUY NOW'])[2]");
			click(buynow);
			
			
}
		}
