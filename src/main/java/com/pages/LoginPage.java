package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="pass")
	WebElement Password;
	
	@FindBy(id="u_0_b")
	WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();	
	}
	public void enterUsernameandpassword(String un,String pwd) {
		userName.sendKeys(un);
		Password.sendKeys(pwd);
	}
	
	public HomePage clickOnLoginBtn() {
		btnLogin.click();
		
		return new HomePage();
		
	}
	
	
	
}
