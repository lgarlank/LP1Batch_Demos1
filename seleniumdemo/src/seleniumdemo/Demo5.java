package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_new_Fresh\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions mh = new Actions(driver);
		//mh.moveToElement(link).click().build().perform();
		//driver.navigate().back();
		Action MouseOver = mh.moveToElement(link).build();
		MouseOver.perform();
		mh.sendKeys(Keys.ENTER).perform();

	}

}
