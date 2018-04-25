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


public class loginTest 
{
	private AndroidDriver driver;

@Before
 	public static void main(String[] args) throws Exception 
	{
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("deviceName", "Des");
    desiredCapabilities.setCapability("udid", "520011185f15b471");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "7.0");
    desiredCapabilities.setCapability("appPackage", "com.getzuper.debug");
    desiredCapabilities.setCapability("appActivity", "com.getzuper.screens.login.LoginActivity");
    desiredCapabilities.setCapability("noReset", true);
    desiredCapabilities.setCapability("autoGrantPermissions", true);
    

 	AppiumDriver driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);     
	}


 //@Test
  	public void Login() 
  	{
  	        String app_package_name = "com.getzuper.debug:id/";
  	        By login_Button = By.id(app_package_name + "activity_welcome_new_button_log_in");

  	        driver.findElement(login_Button).click();
 
	  /**(new TouchAction(driver)).tap(838, 1523).perform();
	  MobileElement el1 = (MobileElement) driver.findElementById("com.getzuper.debug:id/activity_welcome_new_button_log_in");
	  el1.click();
	  MobileElement el2 = (MobileElement) driver.findElementById("com.getzuper.debug:id/activity_login_email_edittext");
	  el2.sendKeys("gt@getzuper.com");
	  MobileElement el3 = (MobileElement) driver.findElementById("com.getzuper.debug:id/activity_login_password_edittext");
	  el3.sendKeys("Takatori42!");
	  MobileElement el4 = (MobileElement) driver.findElementById("com.getzuper.debug:id/activity_login_button_log_in");
	  el4.click();
	  
	  MobileElement el5 = (MobileElement) driver.findElementById("com.getzuper.debug:id/pin_dot_0");
	  el5.sendKeys("0");
	  MobileElement el6 = (MobileElement) driver.findElementById("com.getzuper.debug:id/pin_dot_1");
	  el6.sendKeys("2");
	  MobileElement el7 = (MobileElement) driver.findElementById("com.getzuper.debug:id/pin_dot_2");
	  el7.sendKeys("3");
	  MobileElement el8 = (MobileElement) driver.findElementById("com.getzuper.debug:id/pin_dot_3");
	  el8.sendKeys("4");
	  MobileElement el9 = (MobileElement) driver.findElementById("com.getzuper.debug:id/pin_dot_4");
	  el9.sendKeys("5");
	  MobileElement el10 = (MobileElement) driver.findElementById("com.getzuper.debug:id/pin_dot_5");
	  el10.sendKeys("6");
	  **/
  	}

 @After
 	public void tearDown() 
 	{
	 	driver.quit();
	 }
	
}
