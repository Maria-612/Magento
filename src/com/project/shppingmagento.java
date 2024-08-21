package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shppingmagento {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
		 
		
		 WebElement emailButton = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
		 emailButton.sendKeys("robot120@gmail.com");
		 
//		 Thread.sleep(5000);
//		 
//		 WebElement passButton = driver.findElement(By.xpath("//input[@id='customer-password']"));
//		 passButton.sendKeys("Robot@120");
//		
//		 WebElement firstName1 = driver.findElement(By.name("firstname"));
//		 firstName1.sendKeys("ABC");
		

	}

}
