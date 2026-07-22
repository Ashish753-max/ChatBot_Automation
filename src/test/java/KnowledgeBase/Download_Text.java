package KnowledgeBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Download_Text {

	public static void main(String[] args) {
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
		
		// Locate the whole file card
		WebElement fileCard=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[2]/div/div/div")));
	//	WebElement fileCard = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[2]/div/div/div"));

		// Hover over the file card
		Actions actions = new Actions(driver);
		actions.moveToElement(fileCard).perform();
		
		// Click on the download button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[2]/div/div/div/div[4]/button[1]"))).click();
		
		// Click on the confirm download button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/div/div[2]/div[2]/button[2]"))).click();

	}

}
