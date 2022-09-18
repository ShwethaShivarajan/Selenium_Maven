package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class HomeTest extends BaseClass {
	
	@Test
	public void Test4() {
		
		test.log(LogStatus.INFO, "Test4 started");
		System.out.println("Inside Home class");
	}

}
