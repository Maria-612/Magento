package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class bigbasket1 {

	public static void main(String[] args) throws AWTException {
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login/ Sign Up']"));
		loginButton.click();

		WebElement emailButton = driver.findElement(By.id("multiform"));
		emailButton.sendKeys("7299930730");
		
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		
        
		
		
		
		
		
		
		
		
		
	}

}
