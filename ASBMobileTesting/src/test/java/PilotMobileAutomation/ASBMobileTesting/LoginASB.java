package PilotMobileAutomation.ASBMobileTesting;

import java.net.MalformedURLException;
import java.time.Duration;
import java.time.temporal.TemporalAmount;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class LoginASB extends AppiumTest {
	
	@Test
	public void VerifyLogin() throws MalformedURLException, InterruptedException {
		
		//new features carousel
		//driver.findElement(By.xpath("(//*[@text='Close'])")).click();
		//Thread.sleep(3000);
	
		
	String overviewScreenTitle = driver.findElement(By.xpath("(//*[@text='Overview'])")).getText();
	Assert.assertEquals("Overview", overviewScreenTitle);
	
	}
}

