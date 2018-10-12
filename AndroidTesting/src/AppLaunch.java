import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLaunch {
	//static AndroidDriver<AndroidElement> driver=new AndroidDriver(null);
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException
	{
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		//File fs=new File(f,"Raaga Hindi Tamil Telugu songs and podcasts_v8.0.2_apkpure.com.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		if(device=="emulator") {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		}else if(device=="real device") {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
//		driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Alert Dialogs']")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='OK CANCEL DIALOG WITH A MESSAGE']")).click();
//		// To click on ok button to accept the alert
//		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
//		// To close the app
//		driver.closeApp();
		return driver;
	}
	
	public static void scroll(String txt)
	{
//		capabilities("emulator");
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+txt+"\"))");
	}

	
	
}
