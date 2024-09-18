package org.cts.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	WebElement frame1 = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(frame1);
	
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("Oranium");
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	
	WebElement nested = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	nested.click();
	
	WebElement frame2  = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(frame2);
	WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(frame3);
	
	WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
	text2.sendKeys("Selenium");	
}
}
