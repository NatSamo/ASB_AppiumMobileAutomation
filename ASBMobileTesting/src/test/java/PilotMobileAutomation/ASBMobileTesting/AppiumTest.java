package PilotMobileAutomation.ASBMobileTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {

		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\user\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("TestEmulator_1");
		options.setApp("C:\\Users\\user\\eclipse-workspace\\ASBMobileTesting\\src\\test\\java\\resources\\ASB_Int_2_1.0.0.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeClass
	public void LoginToASB() throws MalformedURLException, InterruptedException {
		
		driver.findElement(By.id("com.associatedbank.digitalbanking.integrationtwo:id/cancel_button")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)")).click();
		driver.findElement(By.xpath("(//*[@text='Enter your username'])")).sendKeys("test4597@associatedbank.online");
		driver.findElement(By.xpath("(//*[@text='Enter password'])")).sendKeys("Pa$$word8");
		driver.findElement(By.xpath("(//*[@text='Submit'])")).click();
		driver.findElement(By.xpath("(//*[@text='No thanks'])")).click();
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		service.stop();
	}

}
