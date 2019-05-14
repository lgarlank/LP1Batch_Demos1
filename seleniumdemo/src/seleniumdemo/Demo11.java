package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Users//IBM_ADMIN//Desktop//test.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]//parent::tr//following-sibling::tr//td[2]")).getText());
	}

}
