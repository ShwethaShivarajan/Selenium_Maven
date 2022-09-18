package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {

	@Test
	@Parameters({ "uname", "pwd" })
	public void Test1(String UserName, String Password) {

		test.log(LogStatus.INFO, "Test 1 started");
		// passing the base class driver in the parameter to loginpage method
		LoginPage lp = new LoginPage(driver);

		lp.Login(UserName, Password);

		// Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));

		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActError, ExpError);
		Assert.assertTrue(Error.isDisplayed());
	}

	@Test
	public void Test2() {

		test.log(LogStatus.INFO, "Test 2 started");

		// negative TC
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abcd@1233");

	}

	@Test
	public void Test3() {

		test.log(LogStatus.INFO, "Test 3 started");

		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();

		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName, Password);

	}
}
