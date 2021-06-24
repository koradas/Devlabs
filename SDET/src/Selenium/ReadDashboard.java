package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadDashboard {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
          //getTitle() to obtain page title
	      System.out.println("Page title is : " + driver.getTitle());
	      WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
	      WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input"));
	      WebElement login=driver.findElement(By.name("Submit"));
	      username.sendKeys("Admin");
	      password.sendKeys("admin123");
	      login.click();
	      
	      String dash;
	      dash=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1")).getText();
	      System.out.println(dash);

	}

}
