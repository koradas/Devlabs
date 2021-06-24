
package Selenium;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;  
public class PriorityTest   
{  
@Test (priority = 1) 
 public void Cr()  
 {  
     System.out.println("Secord Priority"); 
     
 }

@Test (priority = 0)  
public void Dr()  

{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
       //getTitle() to obtain page title
	      System.out.println("Page title is : " + driver.getTitle());
	      driver.quit();
 }  
} 