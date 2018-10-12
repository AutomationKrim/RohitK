import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;


public class Gesture2 extends AppLaunch {
	
	static AndroidDriver<AndroidElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		driver=capabilities("real device");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		Dimension size = driver.manage().window().getSize();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']")).click();
//		TouchAction t=new TouchAction(driver);
//		new TouchAction(driver).tap(tapOptions().withElement(element(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']"))))
//        .waitAction(waitOptions(Duration.ofMillis(250))).perform();
	    Thread.sleep(2000);
		TouchAction t=new TouchAction(driver);
		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']")))).perform();
		Thread.sleep(2000);
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element
				(driver.findElementByXPath("//android.widget.TextView[@text='People Names']"))).withDuration(Duration.ofMillis(3000))).release().perform();
		
		//capture the text from pop-up
		String s=driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']")).getText();
		System.out.println(s);
		driver.closeApp();
	}
	
}
