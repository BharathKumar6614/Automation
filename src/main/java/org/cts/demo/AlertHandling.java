package org.cts.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//button[text()='Alert']"));
		alert.click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		
		WebElement confirmbox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirmbox.click();
		Thread.sleep(2000);
		
		Alert b = driver.switchTo().alert();
		b.accept();
		
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt']"));
		prompt.click();
		
		Alert c= driver.switchTo().alert();
		c.sendKeys("Hi Bharath Welcome");
		c.accept();
		
		
		
	}

}
