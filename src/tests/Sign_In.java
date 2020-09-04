package tests;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.SignUpPage;
import utility.Constant;

public class Sign_In {

	private static WebDriver driver = null;
	static Logger log = Logger.getLogger("devpinoyLogger");
	
	@BeforeTest
	  public void launchBrowser() {
		    driver = new ChromeDriver();
		    driver.get(Constant.URL);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	  }
	
	 @Test(priority = 0)
	 public void fill_Email() throws InterruptedException {
		 
		Constant.WaitForElement();
	    SignUpPage.email(driver).sendKeys("rajeshpanwar1717@gmail.com");
	    log.info("Email is entered");
	 }
	
	 @Test(priority = 1)
	 public void Fill_Password() throws InterruptedException {
	    SignUpPage.password(driver).sendKeys("password");
	 }
		
	 @Test(priority = 2)
	 public void enter_LastName() throws InterruptedException {
		 Constant.WaitForElement();
		SignUpPage.signInNow(driver).click();
		log.info("last name is entered");
	 }	 
	 
	 @Test(priority = 3)
	 public void click_AddCredentials() throws InterruptedException {
		 Thread.sleep(4000);
		SignUpPage.add_Credentials(driver).click();
	 }	 
	 
	 @Test(priority = 4)
	 public void click_Cancel() throws InterruptedException {
		 Constant.WaitForElement();
		SignUpPage.cancel(driver).click();
	 }	 
	 
	 @Test(priority = 5)
	 public void click_Users() throws InterruptedException {
		 Thread.sleep(4000);
		SignUpPage.users(driver).click();
	 }	 
	 
	 @AfterTest
	  public void terminateBrowser() throws InterruptedException{
		 Thread.sleep(4000);
	      driver.close();
	      log.info("The browser is closed and script completed");	 
}
}