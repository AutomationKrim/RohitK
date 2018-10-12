import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstalledApp extends AppLaunch {
	static AndroidDriver<AndroidElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		driver=capabilities("emulator");
		
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
//		Thread.sleep(5000);
//		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "6fa7ca967d94");
//		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.easemytrip.android");
//		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.easemytrip.common.activity.HomeActivity");
//		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

}
