package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
public class AppiumTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Viki");
		caps.setCapability("udid", "32040ee4cf5d31a3"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("appPackage", "com.facebook.katana");
		caps.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		//caps.setCapability("'appWaitActivity", "com.facebook.katana.LoginActivity");
		
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/login_username")).click();
				driver.findElement(By.id("com.facebook.katana:id/login_username")).sendKeys("blueonelove82@gmail.com");
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/login_password")).click();
				driver.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys("xxxxxxxx$xxx");
				Thread.sleep(5000);
				driver.findElement(By.id("com.facebook.katana:id/login_login")).click();
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}