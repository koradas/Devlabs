package Selenium;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeEg {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://www.google.com/");
     	  driver.manage().window().maximize();
     	  
     	 driver.manage().window().setPosition(new Point(100, 1000));
     	

     	        
     	       //To Delay execution for 10 sec. as to view the minimize browser
     	        //you can view in the taskbar below of the screen.
     	        Thread.sleep(20000);
     	        
     	        //Close the browser
     	        //driver.quit();
	}	
}