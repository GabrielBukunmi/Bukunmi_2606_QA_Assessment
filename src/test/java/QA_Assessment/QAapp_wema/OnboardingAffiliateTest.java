package QA_Assessment.QAapp_wema;

import java.net.MalformedURLException;
import java.net.URISyntaxException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

public class OnboardingAffiliateTest extends BaseTest{
	@Test
	public void AffiliateOnboarding() throws MalformedURLException, URISyntaxException, InterruptedException
	
	{
		
		//automation code
	driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/gettingStartedBtn")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sign up as an affiliate\"]")).click();
		
		//click continue
		Thread.sleep(200);
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/continueButton\"]")).click();
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.wemabank.alat.office.alat_qa_test:id/item']")).click();
		Thread.sleep(300);

			
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/item\" and @text=\"WEMA\"]")).click();
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/firstNameEditText")).sendKeys("Bukunmi");
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/lastNameEditText")).sendKeys("Tester");
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/emailAddressEditText")).sendKeys("Ourgreatbank@test.com");
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/passwordTextInputEditText")).sendKeys("Password1");
		
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/repasswordTextInputEditText")).sendKeys("Password1");
		
		//assert that password match
		WebElement passwordField = driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/repasswordTextInputEditText"));
		 String fieldValue = passwordField.getAttribute("text");
		 Assert.assertEquals(fieldValue, "Password1", "The field value does not match the input text.");
	
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/signUpButton")).click();
		Thread.sleep(4000);
		
	    }
}

