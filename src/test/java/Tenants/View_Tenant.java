package Tenants;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class View_Tenant {

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
		
		// click on the Tenants
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/nav/div[6]/div/button[1]"))).click();
		
		// click on the view button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/div/main/div/div[4]/table/tbody/tr[1]/td[6]/div/button[3]"))).click();

	}

}
