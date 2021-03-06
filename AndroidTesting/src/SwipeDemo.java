import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeDemo extends AppLaunch {
	
	static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		driver=capabilities("emulator");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		TouchAction t=new TouchAction(driver);
		PointOption<ElementOption> strtPoint=ElementOption.element(driver.findElementByXPath("//*[@content-desc='15']"));
		PointOption<ElementOption> endPoint=ElementOption.element(driver.findElementByXPath("//*[@content-desc='45']"));
		t.press(strtPoint).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(endPoint).release().perform();
		driver.closeApp();
	}

}
