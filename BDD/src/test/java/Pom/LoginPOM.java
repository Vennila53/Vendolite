package Pom;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {

	WebDriver driver;

	By txt_username = By.id("mat-input-0");
	By txt_password = By.id("mat-input-1");
	By btn_login = By.xpath("/button[@class=\"mat-focus-indicator mat-raised-button mat-button-base mat-primary\"]\r\n");

	public LoginPOM(WebDriver driver) {
		 this.driver=driver;
	}

public void enterUsername(String username) {
driver.findElement(txt_username).sendKeys(username);
}

public void enterPassowrd(String password) {
driver.findElement(txt_password).sendKeys(password);
}

public void btnLog() {
	driver.findElement(btn_login).click();

}}

