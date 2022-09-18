package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// *****************Objects/Web elements**************

	@FindBy(linkText = "Log in")
	WebElement LoginLink;

	@FindBy(name = "user_login")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(className = "rememberMe")
	WebElement Checkbox;

	@FindBy(name = "btn_login")
	WebElement LoginBtn;

	// create the below constructor to use the base class driver and initialize the
	// driver
	public LoginPage(WebDriver basedriver) {
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this); // pagefactory is a class - initializes all page elements. FindBy
													// doesn't work if this is not added
	}

	// page object model is a design pattern
	// *********************Methods*************************

	public void Login(String UsernameVal, String PwVal) {

		// Step1. Click on the Login Link

		LoginLink.click();

		// Step2: Enter Username
		UserName.sendKeys(UsernameVal);

		// Step3: Enter Password
		Password.sendKeys(PwVal);

		// Step4 Click Remember Me checkbox
		Checkbox.click();

		// Step5: Click on Login Button
		LoginBtn.click();
	}

}
