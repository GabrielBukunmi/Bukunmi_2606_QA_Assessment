package QA_Assessment.QAapp_wema;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException
	{
	//starting appium server programmatically
			 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Bukunmi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
			// service.start();
			
			
			//appium code - appium server - mobile
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("QAapp_Wema");//emulator
		options.setApp("C:\\Users\\Bukunmi\\eclipse-workspace\\QAapp_wema\\src\\test\\java\\resources\\QA_Dev_test_test_build.apk");
		
			 driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}
}
