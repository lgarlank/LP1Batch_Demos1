package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Number of Tabs are " + tabs.size());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		
		
	}

}
