package seleniumdemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("txtUsername")).sendKeys("linda.anderson");
		String Value = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(Value);
		driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Recru")).click();	
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement e:links)
		{
			String linktext = e.getText();
			System.out.println(linktext);
			
		}
		
		
	}

}
