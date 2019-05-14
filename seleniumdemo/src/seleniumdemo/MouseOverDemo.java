package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//String ExpectedTitle = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		WebElement Perf=driver.findElement(By.linkText("Performance"));

		Actions mouseturnover=new Actions(driver);
		mouseturnover.moveToElement(Perf).click().build().perform();
		Thread.sleep(2000);
		WebElement Config=driver.findElement(By.linkText("Configure"));
		mouseturnover.moveToElement(Config).click().build().perform();
		Thread.sleep(1000);
		WebElement Kv=driver.findElement(By.linkText("KPIs"));
		mouseturnover.moveToElement(Kv).click().build().perform();

	}

}
