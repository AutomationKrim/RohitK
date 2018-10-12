import java.net.MalformedURLException;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.google.common.annotations.VisibleForTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeTest extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabilities("emulator");
		driver.get("http://cricbuzz.com");
		driver.findElement(By.xpath("//span[text()='Menu ']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,480)", "");
		Assert.assertTrue(driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("header"));
	}

}
