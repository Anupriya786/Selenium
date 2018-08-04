package dailyCodingChallenge;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;


public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch browser
					System.setProperty("webdriver.chrome.driver", "D:\\Testleaf\\chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
		// load url
				driver.get("http://testleaf.herokuapp.com/");
				
				// implicitwait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//click Checkbox link
				driver.findElementByLinkText("Checkbox").click();

				// Identify the element and store
				WebElement checkbox=driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]");

				// select check box of java
				checkbox.click();

				//verify check box is selected or not
				if (checkbox.isSelected()) 
					System.out.println("The check box is selected");
				else
					System.out.println("The check box is not selected");

				//close browser
				driver.close();
				

	}

}
