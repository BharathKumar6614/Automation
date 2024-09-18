package org.cts.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("country"));
		Select s = new Select(country);
		s.selectByValue("india");
		
		WebElement colors = driver.findElement(By.id("colors"));
		Select s1 = new Select(colors);
		s1.selectByIndex(3);
		
	}

}
