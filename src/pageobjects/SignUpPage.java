package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	private static WebElement element = null;
	 
    public static WebElement first_Name(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@name='firstName']"));
 
         return element;
 
         }
 
     public static WebElement last_Name(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@name='lastName']"));
 
         return element;
 
         }
 
     public static WebElement email(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@name='email']"));
 
         return element;
 
         }	
 
     public static WebElement password(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("//input[@name='password']"));
 
         return element;
 
         }	
     
   public static WebElement policy(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("//input[@name='policy']"));
 
         return element;
 
         }	
   
   public static WebElement signUp(WebDriver driver){
  	 
       element = driver.findElement(By.xpath("//a[contains(text(),\"Sign up\")]"));

       return element;

       }	
   
   public static WebElement signUpButton(WebDriver driver){
	  	 
       element = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));

       return element;

       }	
   
   public static WebElement signInNow(WebDriver driver){
	  	 
       element = driver.findElement(By.xpath("//span[contains(text(),'Sign in now')]"));

       return element;

       }	
   
   public static WebElement add_Credentials(WebDriver driver){
	  	 
       element = driver.findElement(By.xpath("//span[contains(text(),'Add Credential')]"));

       return element;

       }	
   
   public static WebElement cancel(WebDriver driver){
	  	 
       element = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));

       return element;

       }	
   
   public static WebElement users(WebDriver driver){
	  	 
       element = driver.findElement(By.xpath("//p[contains(text(),'Users')]"));

       return element;

       }	
   

}