package org.read;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
//Constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(xpath="//label[@class= 'login_form_login_button uiButton uiButtonConfirm']")
	private List< WebElement>btn;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public List<WebElement> getBtn() {
		return btn;
	}
	
		
	
	
}
