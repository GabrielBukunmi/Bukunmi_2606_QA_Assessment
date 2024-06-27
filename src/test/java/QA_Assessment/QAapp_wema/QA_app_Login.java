package QA_Assessment.QAapp_wema;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import io.appium.java_client.AppiumBy;




public class QA_app_Login extends BaseTest{
	@Test
	
	public void Valid_Login() throws MalformedURLException, URISyntaxException, InterruptedException
	
	{
		
		//automation code
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/loginBtn\"]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/email_input\"]")).sendKeys("test@user3.com");
		
		//enter password and login
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/password_input\"]")).sendKeys("Password1");
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/loginBtn")).click();
		Thread.sleep(2000);
		
		
}
	
	  @Test(dependsOnMethods = "Valid_Login")
	
	public void Invalid_Login() throws MalformedURLException, URISyntaxException, InterruptedException
	
	{
		
		//automation code
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/loginBtn\"]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/email_input\"]")).sendKeys("test@user2.com");
		
		//enter password and login
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/password_input\"]")).sendKeys("Password2");
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/loginBtn")).click();
		Thread.sleep(2000);
		
}
	
		
}