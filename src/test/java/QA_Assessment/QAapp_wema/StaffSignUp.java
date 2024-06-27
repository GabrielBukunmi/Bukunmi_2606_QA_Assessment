package QA_Assessment.QAapp_wema;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StaffSignUp extends BaseTest{
@Test
public void staff_signup() throws InterruptedException
{
	//automation code
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/gettingStartedBtn")).click();
			driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/staffSignUpBtn\"]")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.wemabank.alat.office.alat_qa_test:id/continueButton\"]")).click();
			Thread.sleep(4000);
			
		driver.findElement(By.id("com.wemabank.alat.office.alat_qa_test:id/staffIdEditText")).sendKeys("S012345");
		
			Thread.sleep(4000);
}
}
