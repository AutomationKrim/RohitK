import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Paytm extends AppLaunch {

	static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File f=new File("src");
		//File fs=new File(f,"ApiDemos-debug.apk");
		File fs=new File(f,"Raaga Hindi Tamil Telugu songs and podcasts_v8.0.2_apkpure.com.apk");
		Thread.sleep(12000);
		driver=capabilities("real device");
		Thread.sleep(6000);
		driver.findElementByAndroidUIAutomator("text(\"Explore\")").click();
		Thread.sleep(14000);
		WebElement wb=driver.findElementByAndroidUIAutomator("text(\"CONTINUE\")");
		if(wb.isDisplayed())
		{
		wb.click();
	}else {
		Thread.sleep(3000);
	}
		Thread.sleep(35000);
		System.out.println("Over");
		driver.findElementByAndroidUIAutomator("text(\"Create account\")").click();
		driver.findElementByAndroidUIAutomator("text(\"For myself\")").click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("rohit");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
	}
}










