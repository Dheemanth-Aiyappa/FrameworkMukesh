package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	//This is login page
	public LoginPage(WebDriver lDriver) {
		this.driver = lDriver;
	}
	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement loginBtn;
	
	public void loginToCRM(String username, String passwd) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(username);
		password.sendKeys(passwd);
		loginBtn.click();
	}
}
