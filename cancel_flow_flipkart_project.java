package selenium_automation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import locators.ToLearnXpathByContains;

public class cancel_flow_flipkart_project {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\selenium\\ChromeProfile");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		WebElement hover = driver.findElement(By.xpath("//span[text()='Rahul']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(hover).perform();
		driver.findElement(By.xpath("//div[text()='Orders']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'CAMPUS CAMP')]")).click();
		driver.findElement(By.xpath("//div[text()='Cancel']")).click();
		driver.findElement(By.xpath("//div[text()='Cancel Order']")).click();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='reasonList']")));
		select.selectByVisibleText("Price of the product has now decreased");
		
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'eg: Item not')]")).sendKeys("Not Intrested");
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("(//span[text()='Request Cancellation'])[2]")).click();
		
		

	}

}
