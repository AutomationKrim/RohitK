import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDemo extends AppLaunch {

	static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		driver=capabilities("emulator");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		//For scrolling
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"))");
		
	}

}
