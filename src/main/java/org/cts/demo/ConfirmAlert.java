package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement confirm = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirm.click();
		
		WebElement confimralert = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		confimralert.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
		
	}

}
