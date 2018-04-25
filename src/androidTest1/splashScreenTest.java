package androidTest1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class splashScreenTest 
{
	 	private AndroidDriver driver;
	  
	 	@Before
	 	public static void main(String[] args) throws Exception 
	 	{
	 	//Set the Desired Capabilities
	 	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	 	desiredCapabilities.setCapability("deviceName", "Des");
	 	desiredCapabilities.setCapability("udid", "520011185f15b471"); //Give Device ID of your mobile phone
	 	desiredCapabilities.setCapability("platformName", "Android");
	 	desiredCapabilities.setCapability("platformVersion", "7.0");
	 	desiredCapabilities.setCapability("appPackage", "com.getzuper.debug");
	 	desiredCapabilities.setCapability("appActivity", "com.getzuper.screens.splash.SplashActivity");
	 	desiredCapabilities.setCapability("noReset", "true");
		
	 	AppiumDriver driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
	 	}
}