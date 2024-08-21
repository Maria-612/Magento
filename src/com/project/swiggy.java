package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement signInButton = driver.findElement(By.xpath("//span[text()='Sign In']"));
		signInButton.click();
		
		WebElement phoneNumber = driver.findElement(By.id("mobile"));
		phoneNumber.sendKeys("7299930730");
		
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		loginButton.click();
		
	//	Thread.sleep(8000);
		
		
		WebElement verifyButton = driver.findElement(By.linkText("VERIFY OTP"));
		verifyButton.click();
		
		
		

	}

}
