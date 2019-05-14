package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String UnderContructSite = "Under Construction: Mercuty Tours";
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		String[] linktext = new String[Link.size()];
		int i =0;
		//to extract the link text of each link element
		for (WebElement e:Link)
		{
			linktext[i] = e.getText();
			i++;
			
		}
		// test to check each link working fine or not
		for(String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(UnderContructSite))
			{
				System.out.println("\"" +t +"\"" + "\" + is Under Construction");
			
			}
			else
			{
				System.out.println("\"" +t +"\"" + "\" + is working fine");
			}
			driver.navigate().back();
		}
		driver.quit();

	}

}
