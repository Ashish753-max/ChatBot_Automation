package KnowledgeBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Text {

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
		
		// Click on the add Text button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[1]/div[2]/div[2]/div[3]/button[3]"))).click();
		
		// Enter the Title
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[1]/div[3]/div/input"))).sendKeys("Travelmatic");
		
		Thread.sleep(1000);
		
		//Enter the Description
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[1]/div[3]/div/textarea"))).sendKeys("Travelmatic is a travel management platform that helps businesses manage their travel programs more efficiently. It provides a centralized platform for booking, managing, and reporting on business travel, allowing companies to save time and money while improving the overall travel experience for their employees.");
		
		//click on save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/main/div/main/div[1]/div[3]/div/div/button"))).click();
		

	}

}
