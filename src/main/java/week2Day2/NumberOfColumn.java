package week2Day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		// Number Of Rows
		List<WebElement> count = driver.findElementsByXPath("//section[@class='innerblock']//table//tr");
		int no = count.size();
		System.out.println("Number Of Rows = "+ no);
		// Number Of Cells
		List<WebElement> countt = driver.findElementsByXPath("//section[@class='innerblock']//table//td");
		int no1 = countt.size();
		System.out.println("Number Of Cells = " + no1);
		// Number Of columns in first Row
		List<WebElement> count1 = driver.findElementsByXPath("//section[@class='innerblock']//table//tr[1]/th");
		int no2 = count1.size();
		System.out.println("Number Of columns in first Row = " + no2);
		// Number Of Columns
		List<WebElement> countl = driver.findElementsByXPath("//section[@class='innerblock']//table//th");
		int nocol = countl.size();
		System.out.println("Number Of Columns = " + nocol);
		//Checkbox Progress
		WebElement check = driver.findElementByXPath("(//section[@class='innerblock']//table//tr/td/input)[3]");
		check.click();
	}

}
