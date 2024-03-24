package appium_runner;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebTableClass {
	@BeforeGroups(groups="first")
	public void befor() {
		System.out.println("Before Group");
	}
	
	@AfterGroups(groups="first")
	public void after() {
		System.out.println("After Group");
	}
	
	@Test(groups="first")
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/view_stud.html");
		driver.manage().window().maximize();
		
		System.out.println("First");
		WebElement webTable = driver.findElement(By.xpath("//table[@id='sortingTable']/tbody"));
		
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		
		for(int i=0;i<rowCount;i++) {
			List<WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
			int columnCount = coloumns.size();
			
			for(int j=0;j<columnCount;j++) {
				String details = coloumns.get(j).getText();
				if(details.equalsIgnoreCase("Preethi")) {
					System.out.println(coloumns.get(1).getText());
				}
			}
		}
	}

	@Test
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/view_stud.html");
		driver.manage().window().maximize();
		
		WebElement webTable = driver.findElement(By.xpath("//table[@id='sortingTable']/tbody"));
		
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		
		for(int i=0;i<rowCount;i++) {
			List<WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
			int columnCount = coloumns.size();
			
			for(int j=0;j<columnCount;j++) {
				String details = coloumns.get(j).getText();
				if(details.equalsIgnoreCase("Preethi")) {
					System.out.println(coloumns.get(1).getText());
				}
			}
		}
	}
//	
//	@Test(groups="first")
//	public void test3() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/view_stud.html");
//		driver.manage().window().maximize();
//		
//		WebElement webTable = driver.findElement(By.xpath("//table[@id='sortingTable']/tbody"));
//		
//		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
//		int rowCount = rows.size();
//		
//		for(int i=0;i<rowCount;i++) {
//			List<WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
//			int columnCount = coloumns.size();
//			
//			for(int j=0;j<columnCount;j++) {
//				String details = coloumns.get(j).getText();
//				if(details.equalsIgnoreCase("Preethi")) {
//					System.out.println(coloumns.get(1).getText());
//				}
//			}
//		}
//	}
//	
//	@Test
//	public void test4() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/view_stud.html");
//		driver.manage().window().maximize();
//		
//		WebElement webTable = driver.findElement(By.xpath("//table[@id='sortingTable']/tbody"));
//		
//		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
//		int rowCount = rows.size();
//		
//		for(int i=0;i<rowCount;i++) {
//			List<WebElement> coloumns = rows.get(i).findElements(By.tagName("td"));
//			int columnCount = coloumns.size();
//			
//			for(int j=0;j<columnCount;j++) {
//				String details = coloumns.get(j).getText();
//				if(details.equalsIgnoreCase("Preethi")) {
//					System.out.println(coloumns.get(1).getText());
//				}
//			}
//		}
//		
//	}

}
