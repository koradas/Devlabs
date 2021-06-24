package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Login1 {
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
	      
	      System.out.println("Page title is : " + driver.getTitle());
	      driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	      
	      Actions action = new Actions(driver);
	      WebElement we = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
	      action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/a"))).click().build().perform();
	      WebElement we1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a"));
	      action.moveToElement(we1).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a"))).click().build().perform();
	      Thread.sleep(2000);
	      WebElement we2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[3]/a"));
	      action.moveToElement(we2).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[3]/a"))).click().build().perform();
	      Thread.sleep(2000);
	      WebElement we3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[4]/a"));
	      action.moveToElement(we3).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[4]/a"))).click().build().perform();
	      Thread.sleep(2000);
	      driver.quit();
	}

}
