package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.InvalidSelectorException;

public class Amazon_Chrome_Driver {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:/SELENIUM/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.amazon.com");
		  Thread.sleep(5000);  // Wait for some time
		  WebElement searchBox = driver.findElement(By.name("field-keywords"));
		  searchBox.sendKeys("apple watch");
		  searchBox.submit();
		  WebElement click = driver.findElement(By.className("childRefinementLink"));
		  click.click();{
		// verifying text
		  if(driver.getPageSource().contains("4.4 out of 5 stars")){
			  System.out.println("Text is present");
			  }else{
			  System.out.println("Text is absent");
			  }}
		  Thread.sleep(5000);  // wait 5 second
		  
		  driver.quit();

}}
