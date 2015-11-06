package com.appium.facebook.androidUiSelector1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FacebookLoginTest {
	@Test
	
	public void testLoginFb() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setCapability("automationName", "appium");
		capabilities.setCapability("platformName",System.getProperty("PlatformName") );
		capabilities.setCapability("platformVersion", System.getProperty("PlatformVersion"));
		capabilities.setCapability("deviceName", "Hudl2");
		capabilities.setCapability("app", "/Users/MinnieDarshan/Downloads/facebok.apk");
		capabilities.setCapability("appPackage", "com.facebook.katana");
		capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		capabilities.setCapability("noReset", false);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_username\")").sendKeys("minnie.darshan@gmail.com");
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").sendKeys("darshan6");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_login\").text(\"LOG IN\")").click();
		Thread.sleep(8000);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/feed_composer_status_button\").text(\"STATUS\")").click();
	
		/*if(driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/audience_call_to_action\").text(\"Who do you want to share this post with?\")").isDisplayed()){
			driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/skip_link\").text(\"Skip\")").click();
		}*/
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/status_text\").text(\"What's on your mind?\")").sendKeys("Hi::: Good Night to All");
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/composer_primary_named_button\").description(\"Post\")").click();
		Thread.sleep(20);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/header_view_menu_button\").description(\"Story Menu\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/bottomsheet_list_item_title\").text(\"Delete\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Delete\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/bookmarks_tab\").description(\"More\")").click();
		driver.scrollTo("Log Out").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Log Out\")").click();
		
		
		
		
	}

}
