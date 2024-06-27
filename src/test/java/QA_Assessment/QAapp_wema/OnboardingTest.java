package QA_Assessment.QAapp_wema;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OnboardingTest extends BaseTest{
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
		
}
}
