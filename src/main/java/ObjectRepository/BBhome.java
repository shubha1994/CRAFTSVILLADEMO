package main.java.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBhome {


	@FindBy(xpath="a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="Submit")
	private WebElement LoginButton;
	
	
	@FindBy(xpath="//span[text()='Test']")
	private WebElement LogoutHover;
	
	public WebElement getLogoutHover() {
		return LogoutHover;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	@FindBy(xpath="//div[@class='dropdown user-dropdown hvr-drop']/ul[1]/li[6]/a")
	private WebElement LogoutButton;
	
	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}

