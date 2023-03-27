package PilotMobileAutomation.ASBMobileTesting;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class ViewTransfersPage extends LoginASB {
	
	@Test
	public void TransferMoneyPage() throws MalformedURLException, InterruptedException {
	
	driver.findElement(AppiumBy.accessibilityId("Quick Access")).click();
	driver.findElement(By.xpath("(//*[@text='Make a Transfer'])")).click();
	Thread.sleep(3000);
	
	String TrMoneyScreenTitle = driver.findElement(By.xpath("(//*[@text='Transfer Money'])")).getText();
	Assert.assertEquals("Transfer Money", TrMoneyScreenTitle);
	
	}
}
