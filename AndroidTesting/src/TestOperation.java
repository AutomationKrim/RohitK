import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestOperation extends AppLaunch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=capabilities("emulator");
		driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Alert Dialogs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='OK CANCEL DIALOG WITH A MESSAGE']")).click();
		// To click on ok button to accept the alert
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		// To close the app
		driver.closeApp();
		System.out.println("Success");

	}

}