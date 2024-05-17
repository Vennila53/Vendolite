package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {

	@FindBy(id="mat-input-0")
	WebElement txt_username;

	@FindBy(id="mat-input-1")
	WebElement txt_password;

	@FindBy(xpath="/button[@class=\\\"mat-focus-indicator mat-raised-button mat-button-base mat-primary\\\"]\\r\\n")
	WebElement btn_login;

	@FindBy(xpath="//*[@class=\"ml-4 logomain\"]\r\n")
	WebElement homePage;

	@FindBy(xpath = "//*[@id=\"cdk-overlay-20\"]/snack-bar-container/simple-snack-bar")
	WebElement loginFailedMessage;

	WebDriver driver;

	public LoginPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void enterUsername(String username) {
		txt_username.sendKeys(username);	

	}
	public void enterPassword(String password) {
		txt_username.sendKeys(password);
	}
	public void btnLogin() {
		btn_login.click();
	}
	public boolean isHomePageDisplayed() {
        return homePage.isDisplayed();
    }

    public boolean isLoginFailedMessageDisplayed() {
        return loginFailedMessage.isDisplayed();
}}