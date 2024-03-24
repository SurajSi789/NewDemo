package appium_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumPageFactory {
	private static AndroidDriver driver;
	WebDriverWait wb;
	
	public AppiumPageFactory(AndroidDriver driver) {
		AppiumPageFactory.driver = driver;
		PageFactory.initElements(driver, this);
		wb = new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	@FindBy(id="com.android.launcher3:id/page_indicator")
	private WebElement appDrawer;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='Settings']")
	private WebElement settingsApp;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Display\"]")
	private WebElement displaySetting;
	
	@FindBy(xpath="//android.widget.TextView[@text='Brightness level']")
	private WebElement brightnessSetting;
	
	public void clickSettingsApp() {
		TouchAction<?> act = new TouchAction<>(driver);
		act.press(PointOption.point(550, 1838)).moveTo(PointOption.point(545,300)).release().perform();
//		appDrawer.click();
		
		wb.until(ExpectedConditions.elementToBeClickable(settingsApp));
		settingsApp.click();
		
	}
	
	public void clickDispayOption() {
		wb.until(ExpectedConditions.elementToBeClickable(displaySetting));
		displaySetting.click();
	}
	
	public void clickBrightnessOption() {
		wb.until(ExpectedConditions.elementToBeClickable(brightnessSetting));
		brightnessSetting.click();
	}
	
	@SuppressWarnings("deprecation")
	public void increaseBrightness() throws InterruptedException {
		Thread.sleep(4000);
		WebElement slider = driver.findElement(By.id("com.android.systemui:id/slider"));
//		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)slider).getId()));

		TouchAction<?> act = new TouchAction<>(driver);
		act.press(PointOption.point(550, 1838)).moveTo(PointOption.point(545,1200)).perform();
		//touch action is not working for this dependency, so need to check some other file.
	}
}
