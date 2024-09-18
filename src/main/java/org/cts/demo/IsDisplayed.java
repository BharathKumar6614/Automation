package org.cts.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
	 boolean logo = driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();
	 if(logo==true)
	 {
		 System.out.println("Logo is available");
	 }
	 else {
		 System.out.println("Logo is not available");
	 }
	 
	 
}
	}


