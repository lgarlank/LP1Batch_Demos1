package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		
		//Drop Down selection List
		WebElement DD = driver.findElement(By.name("passCount"));
		Select dropdown = new Select(DD);
		List<WebElement> data = dropdown.getOptions();
		System.out.println("Dropdown size is" + data.size());
		for (int i=0 ; i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		dropdown.selectByValue("2");
		
		WebElement DF = driver.findElement(By.name("fromPort"));
		Select DFList = new Select(DF);
		List<WebElement> DFData = DFList.getOptions();
		System.out.println("Departing from List " +DFData.size());
		for(int i=0;i<DFData.size();i++)
		{
			System.out.println("Departing from Names are " +DFData.get(i).getText());
		}
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value ='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("passFirst0")).sendKeys("LakshmiNarayana");
		driver.findElement(By.name("passLast0")).sendKeys("Garlanka");
		/*WebElement Meals = driver.findElement(By.name("pass.0.meal"));
		Select MList = new Select(Meals);
		MList.selectByValue("Low Calorie"); */
		driver.findElement(By.name("passFirst1")).sendKeys("Ganesh");
		driver.findElement(By.name("passLast1")).sendKeys("Garlanka");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567898");
		
		//Check box
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for (WebElement e:checkbox)
		{
			e.click();
		}
		
	}

}
