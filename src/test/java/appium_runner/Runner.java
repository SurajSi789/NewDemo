package appium_runner;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appium_driverfactory.DriverClass;
import appium_pagefactory.AppiumPageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Runner {
	public static AndroidDriver driver;

	@BeforeClass
	public void setTestDriver() throws MalformedURLException {
		driver = DriverClass.getDriver();
	}

	@Test
	public void testSettingsApp() throws InterruptedException {
		AppiumPageFactory ap = new AppiumPageFactory(driver);
		ap.clickSettingsApp();
		ap.clickDispayOption();
		Thread.sleep(2000);
		ap.clickBrightnessOption();
		ap.increaseBrightness();
	}
	
	@AfterClass
	public void closeServer() {
		driver.quit();
	}
}
