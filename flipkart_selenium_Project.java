package selenium_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart_selenium_Project {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\selenium\\ChromeProfile");
		
        WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'/flipkart-minutes-store?')]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]")).sendKeys("pistachios roasted salted",Keys.ENTER);
	    Thread.sleep(3000);
	    Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[@title='Browse Minutes categories']"))).perform();
	    driver.findElement(By.xpath("//a[@title='Flipkart']")).click();
	    driver.findElement(By.xpath("//input[contains(@title,'Search for Products,')]")).sendKeys("shoes for men",Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'CAMP-GLACIER Running')]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'cart')]/following::div[contains(text(),'Buy at')]")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Select variant']/following::div[text()='9']/..")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Continue']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Price Details']/following::div[contains(text(),'Continue')]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[text()='Cash on Delivery']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	    Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Confirm order']")).click();
        
	    
	    
	}
}