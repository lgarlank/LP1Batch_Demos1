package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.print(driver.findElement(By.xpath("//table/tbody[1]/tr[1]/td[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@name='email']//ancestor::tr//preceding-sibling::tr/td/label")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//following-sibling::td/*[@id='loginbutton']")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//following-sibling::td/*[@name='pass']")).getText());

	}

}
