package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String ExpectedTitle = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		String ActualTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("If title is same proceed and logout");
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			//driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		}
		else
		{
			System.out.println("Title is wrong");
		}

		driver.close();
	}

}

