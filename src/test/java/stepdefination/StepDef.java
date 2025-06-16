package stepdefination;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdduserPage;
import pageObjects.LoginPage;

public class StepDef extends Baseclass {
	  
	  
	  @Before
	  public void setup()
	  {
		  driver=new ChromeDriver(); 
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	  
	   loginPage=new LoginPage(driver);
	   userPage=new AdduserPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String password) throws InterruptedException {
		loginPage.setUsername(uname);   
	    loginPage.setPassowrd(password);
	}

	
	@When("Click on Login")
	public void click_on_login() {
	   loginPage.clickONlogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expected) {
	 String actual=driver.getTitle();
	 Assert.assertEquals( expected, actual);
	}

	@When("User click on mendauser link")
	public void user_click_on_mendauser_link() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  loginPage.clickondrop(); 
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	    loginPage.clickonlogOut();
	}

	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}
  
//	 add user 
	
	@When("User click on PIM")
	public void user_click_on_pim() throws InterruptedException {
		userPage.pimClick();
	}

	@When("User click on Add Employee")
	public void user_click_on_add_employee() throws InterruptedException {
		userPage.addempClick();
		userPage.setFirstname("Pratap");
		userPage.setMiddlename("S");
		userPage.setLastname("Yadav");
		userPage.setEmpid("101");
	    
	}

	@When("User click on Save")
	public void user_click_on_save() {
	   userPage.clickSave();
	}

	/*@Then("User get Employee list {string} ")
	public void theUserShouldSeeInEmployeelist(String expectedText) {
		String actualText =userPage.getlist(expectedText);
	    Assert.assertEquals(expectedText, actualText);
	}*/
//	@Then("User get Employee list")
//	public void user_get_employee_list() {
	    
//	}

	@Then("User click on profile")
	public void user_click_on_profile() {
	     loginPage.clickondrop();
	}

	@Then("User click on Logout")
	public void user_click_on_logout() {
		loginPage.clickonlogOut();
	}
	
	@After
	public void tearDown(Scenario sc) {
	    System.out.println("Tear down method executed");

	    if (driver != null) {
	        try {
	            if (sc.isFailed()) {
	                System.out.println("Scenario failed. Taking screenshot...");

	                // Take screenshot
	                TakesScreenshot scrshot = (TakesScreenshot) driver;
	                File srcFile = scrshot.getScreenshotAs(OutputType.FILE);

	                // Save screenshot
	                String filePath = "D:\\Java\\CucumberN\\screenshots\\failed_" + System.currentTimeMillis() + ".png";
	                File destFile = new File(filePath);
	                FileUtils.copyFile(srcFile, destFile);

	                System.out.println("Screenshot saved at: " + filePath);
	            }
	        } catch (Exception e) {
	            System.out.println("Error during screenshot capture: " + e.getMessage());
	        } finally {
	            try {
	                driver.quit();
	                System.out.println("Browser closed.");
	            } catch (Exception e) {
	                System.out.println("Driver quit failed: " + e.getMessage());
	            }
	        }
	    } else {
	        System.out.println("Driver is null. Possibly already closed.");
	    }
	}

	@BeforeStep
	public void beforeStepMethodDemo() {
	    System.out.println("This is before step");
	}

	@AfterStep
	public void afterStepMethod() {
	    System.out.println("This is after step");
	}
}