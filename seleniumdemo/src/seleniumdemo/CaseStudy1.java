package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@class='button border margin-top-10' and @type='submit']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.linkText("Posts")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("All Posts")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[text() ='apollo']//ancestor::td//preceding-sibling::th//*[@id='cb-select-3371']")).click();
		System.out.println("Test Success");

	}

}
