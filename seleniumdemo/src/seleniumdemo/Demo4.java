package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		String[] linkTexts = new String[links.size()];
		
		int i=0;
		for (WebElement e:links)
		{
			//String linktexts = e.getText();
			linkTexts[i] = e.getText();
			i++;
			//System.out.println(linkTexts);
		}
		for (String t : linkTexts)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals("Under Construction: Mercury Tours"))
			{
			System.out.println("\"" + t + "\"" +" is Under Construction");
			}
			else
			{
				System.out.println("\"" + t + "\"" +" is Working fine");
			}
			driver.navigate().back();
		}

	}

}