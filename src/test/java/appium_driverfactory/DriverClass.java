package appium_driverfactory;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverClass {
	private static AndroidDriver driver;
	
	public static AndroidDriver getDriver() throws MalformedURLException {
		
		UiAutomator2Options ui = new UiAutomator2Options();
		ui.setCapability("platformName","Android");
		ui.setCapability("appium:platformVersion", "11.0");
		ui.setCapability("appium:deviceName", "Samsung Galaxy S23");
		
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability("platformName", "Android");
//		dc.setCapability("appium:platformVersion", "8.1");
//		dc.setCapability("appium:deviceName", "Pixel 7 Pro API 27");
		
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),ui);
		return driver;
	}
}
