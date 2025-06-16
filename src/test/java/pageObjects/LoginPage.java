package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
	   public WebDriver ldriver;
	   
	   public LoginPage(WebDriver rdriver)
	   {
		   
		       ldriver=rdriver;
		       
		       PageFactory.initElements( rdriver,this);
	   }
	   
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement btn_mendausers;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement btn_logout;
	
	public void setUsername(String uname)
	{
		txt_username.sendKeys(uname);
	}
	
	public void setPassowrd(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	public void clickondrop()
	{
		btn_mendausers.click();
	}

	public void clickonlogOut()
	{
		btn_logout.click();
	}

	public void clickONlogin()
	{
		btn_login.click();
	}
}
