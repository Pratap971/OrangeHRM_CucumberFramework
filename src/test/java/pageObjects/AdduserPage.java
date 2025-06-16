package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdduserPage {
	 public WebDriver ldriver;
	   
	  public AdduserPage(WebDriver rdriver)
	  {
		  ldriver=rdriver;
	       
	       PageFactory.initElements( rdriver,this);
	  }
	  
	  @FindBy(xpath="//span[normalize-space()='PIM']")
	  WebElement linkPim;
	  
	  @FindBy(xpath="//a[normalize-space()='Add Employee']")
	  WebElement linkaddemp;
	  
	  @FindBy(xpath="//input[@placeholder='First Name']")
	  WebElement txt_firstname;
	  
	  @FindBy(xpath="//input[@placeholder='Middle Name']")
	  WebElement txt_middlename;
	  
	  @FindBy(xpath="//input[@placeholder='Last Name']")
	  WebElement txt_lastname;
	  
	  @FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	  WebElement txt_empid;
	  
	  @FindBy(xpath="//button[@type='submit']")
	  WebElement btn_submit;
	  
//	  @FindBy(xpath="//h6[normalize-space()='Personal Details']")
//	  WebElement listdetails;
	  
	  public void pimClick()
	  {
		  linkPim.click();
	  }
	  
	  public void addempClick()
	  {
		  linkaddemp.click();
	  }
	  
	  public void setFirstname(String fname)
	  {
		  txt_firstname.sendKeys(fname);
	  }
	 
	  public void setMiddlename(String mname)
	  {
		  txt_middlename.sendKeys(mname);
	  }
	  
	  public void setLastname(String lname)
	  {
		  txt_lastname.sendKeys(lname);
	  }
	  
	 public void setEmpid(String eid)
	 {
		 txt_empid.sendKeys(eid);
	 }
	 
	 public void clickSave()
	 {
		btn_submit.click(); 
	 }
	 
/* public   String  getlist(String elist)
	 {
		  return listdetails.getText();
	 }*/
}
