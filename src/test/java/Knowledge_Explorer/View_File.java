package Knowledge_Explorer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class View_File {

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
		Thread.sleep(2000); // Wait for 2 seconds to ensure the page has loaded
		// Click on the knowledge Explorer
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/nav/div[2]/div/button[2]"))).click();
		
		// Click on the view file button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/div[3]/div[2]/table/tbody/tr[1]/td[1]/div/button"))).click();

	}

}
