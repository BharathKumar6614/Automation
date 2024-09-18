package org.cts.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("Bharath");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Kunmar");
		
		String s = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		String s1 = driver.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
		
		System.out.println(s);
		System.out.println(s1);
		
				
	}

}
