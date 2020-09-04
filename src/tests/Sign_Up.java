package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.SignUpPage;
import utility.Constant;

public class Sign_Up {
	
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
	 public void click_SignUpLink() throws InterruptedException {
		 
		Constant.WaitForElement();
	    SignUpPage.signUp(driver).click();
	    log.info("First name is entered");
	 }
	
	 @Test(priority = 1)
	 public void enter_FirstName() throws InterruptedException {
		Thread.sleep(3000); 
	    SignUpPage.first_Name(driver).sendKeys("Gurpreet");
	    log.info("First name is entered");
	 }
		
	 @Test(priority = 2)
	 public void enter_LastName() throws InterruptedException {
		SignUpPage.last_Name(driver).sendKeys("Riar");
		log.info("last name is entered");
	 }
	 
	 @Test(priority = 3)
	 public void enter_EmailAddress() throws InterruptedException {
		 SignUpPage.email(driver).sendKeys("gurpreetriar1993@gmail.com");
		 log.info("Email is entered");
	 }

	 @Test(priority = 4)
	 public void enter_Password() throws InterruptedException {
		 SignUpPage.password(driver).sendKeys("Qaz@1234");
		 log.info("Password is entered");
	 }
	 
	 @Test(priority = 5)
	 public void agree_Policy() throws InterruptedException {
		 Constant.WaitForElement();
		 SignUpPage.policy(driver).click();
		 log.info("Policy read and agreed");
	 }
	 
	 @Test(priority = 6)
	 public void submit_SignUp() throws InterruptedException {
		 Constant.WaitForElement();
		 SignUpPage.signUpButton(driver).click();
		 log.info("Policy read and agreed");
	 }
	 
	 @Test(priority = 7)
	 public void success_SignUp() throws InterruptedException {
		 Constant.WaitForElement();
		 String Alert = driver.findElement(By.linkText("Account Created Successfully")).getText().trim();
		 assertTrue(Alert.contains("Successfully"));
	 }
	 
	 @AfterTest
	  public void terminateBrowser(){
	      driver.close();
	      log.info("The browser is closed and script completed");	 
}
}