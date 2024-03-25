package appium_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class QAClick {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		
		String checkValue = driver.findElement(By.xpath("//input[@value='option2']/parent::label")).getText().trim();
		
		WebElement dropDwn = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropDwn);
		s.selectByVisibleText(checkValue);
		
		driver.findElement(By.id("name")).sendKeys(checkValue);
		
		driver.findElement(By.id("alertbtn")).click();
		
		//verify alert text with expected text and accept it
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		driver.quit();
	}

}
