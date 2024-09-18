package org.cts.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		List<WebElement> days = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		
		for(WebElement i:days) {
			String s = i.getAttribute("id");
			System.out.println(s);
			if(s.equals("tuesday")) {
				continue;
				
			}
			i.click();
		}
		
	}

}
