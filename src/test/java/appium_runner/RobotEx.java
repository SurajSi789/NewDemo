package appium_runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotEx {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		Robot r = new Robot();
		r.mouseMove(118, 118);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseMove(168, 168);
		
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}
