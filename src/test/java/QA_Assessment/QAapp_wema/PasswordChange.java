package QA_Assessment.QAapp_wema;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;

public class PasswordChange extends BaseTest{
public void ChangePassword() throws MalformedURLException, URISyntaxException, InterruptedException
	
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
}
