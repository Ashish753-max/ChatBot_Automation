package KnowledgeBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edit_System {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();

		
		// open the website 
		driver.get("https://bot.easygds.it/login");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// Enter the email 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"email\"]"))).sendKeys("ashishappnox1@gmail.com");
		
		// Enter the password
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]"))).sendKeys("Ashish@765");
		
		// Click on the login button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/form/button"))).click();
		
		// Click on the knowledge base
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/nav/div[2]/div/button[1]"))).click();
		
		// Click on the edit button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div/main/div/aside/div[2]/div[2]/div/div/button[1]"))).click();
		
		// clear the existing system name
		WebElement system = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div/main/div/aside/div[2]/div[2]/div[2]/input")));
		system.sendKeys(Keys.CONTROL + "a");
		system.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		
		// enter the new system name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div/main/div/aside/div[2]/div[2]/div[2]/input"))).sendKeys("Appnox AI ");
		Thread.sleep(1000);
		// click on the save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save']"))).click();
			

	}

}
