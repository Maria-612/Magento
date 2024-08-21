package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bigbasket {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		
//		WebElement sortByCategory = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
//		sortByCategory.click();
//		
//		WebElement selectCategory = driver.findElement(By.linkText("Bakery Cakes & Dairy"));
//		selectCategory.click();
		
//		WebElement revelanceButton = driver.findElement(By.xpath("(//button[@pattern='outline'])[2]"));
//		revelanceButton.click();
		
//		WebElement revelanceButton = driver.findElement(By.xpath("//span[text()='Relevance']"));
//    	revelanceButton.click();
		
//		WebElement selectBread = driver.findElement(By.xpath("/html/body/div/div/div/div/section[2]/section/ul/li[1]/div/div/div/div/a/span/span"));
//		selectBread.click();
		
//		WebElement searchButton = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		searchButton.sendKeys("Bakery Cakes & Dairy");
//		
//		Actions act = new Actions(driver);
//		
//		
//		Robot rbt = new Robot();
////		rbt.keyPress(KeyEvent.VK_DOWN);
////    	rbt.keyRelease(KeyEvent.VK_DOWN);
//    	
//    	
//    	Thread.sleep(3000);
//    	
//    	rbt.keyPress(KeyEvent.VK_ENTER);
//    	rbt.keyRelease(KeyEvent.VK_ENTER);
    	
    
		
//    	WebElement selectPhoto = driver.findElement(By.xpath("//img[@title='fresho! Signature Muffin/Cup Cake - Vanilla 200 g (Pack of 4)']"));
//    	selectPhoto.click();
    	
//    	driver.get("https://www.bigbasket.com/pd/40037499/fresho-signature-muffincup-cake-vanilla-200-g/?nc=cl-prod-list&t_pos_sec=1&t_pos_item=1&t_s=Muffin%252FCup+Cake+-+Vanilla");
//    	
//    	WebElement addToCart = driver.findElement(By.xpath("(//button[@color='silverSurfer'])[4]"));
//    	addToCart.click();
    	

    	
		
//			
//		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login/ Sign Up']"));
//		loginButton.click();
//		
//		WebElement emailButton = driver.findElement(By.id("multiform"));
//		emailButton.sendKeys("7299930730");
//		
//		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		continueButton.click();
//		
//		
////		WebElement continueButton1 = driver.findElement(By.partialLinkText("Verify & Continue"));
////		continueButton1.click();
//		
//		
//		WebElement verifyButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		verifyButton.click();
		
		Thread.sleep(3000);
		
//		Actions act = new Actions(driver);
//		
//		
//		Robot rbt = new Robot();
//		rbt.keyPress(KeyEvent.VK_DOWN);
//    	rbt.keyRelease(KeyEvent.VK_DOWN);
////    	
////    	Thread.sleep(3000);
////    	
////    	rbt.keyPress(KeyEvent.VK_DOWN);
////    	rbt.keyRelease(KeyEvent.VK_DOWN);
////    	
//    	Thread.sleep(3000);
//    	
//    	rbt.keyPress(KeyEvent.VK_ENTER);
//    	rbt.keyRelease(KeyEvent.VK_ENTER);
//    	
//    	driver.manage().window().maximize();
//    	
//    	WebElement relevanceButton = driver.findElement(By.xpath("(//button[@pattern='outline'])[2]"));
//    	Select sc = new Select(relevanceButton);
//    	relevanceButton.click();
//    	
//    	
////    	WebElement toothbrushButton = driver.findElement(By.xpath("(//button[@color='white'])[5]"));
////    	toothbrushButton.click();
////    	
////		
////		WebElement selectImage = driver.findElement(By.xpath("(//img[@data-nimg='responsive'])[1]"));
////		selectImage.click();
		
		

	}

}
