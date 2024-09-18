package org.cts.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static void capture(WebDriver driver) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File img = screen.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshot/facebook.png");
		FileUtils.copyFile(img, dest);	
	}
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		capture(driver);
	}
	
		
	}


