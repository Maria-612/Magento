package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Magento1 {
		

 public static void main(String[] args) throws InterruptedException, AWTException {
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://magento.softwaretestingboard.com/");
			
	driver.manage().window().maximize();
			
	WebElement createAccount = driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
	createAccount.click();
			
	Thread.sleep(1000);
			
	WebElement firstName = driver.findElement(By.xpath("(//input[@class='input-text required-entry'])[1]"));
	firstName.sendKeys("ABC");
			
	Thread.sleep(1000);
			
	WebElement lastName = driver.findElement(By.xpath("(//input[@class='input-text required-entry'])[2]"));
	lastName.sendKeys("DEF");
			
	Thread.sleep(1000);
			
	WebElement emailField = driver.findElement(By.xpath("(//input[(@id='email_address')])[1]"));
	emailField.sendKeys("robot120@gmail.com");
			
	Thread.sleep(1000);
			
	WebElement passwordField = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
	passwordField.sendKeys("Robot@120");
			
	Thread.sleep(1000);
			
	WebElement confirmpasswordField = driver.findElement(By.xpath("(//input[(@id='password-confirmation')])[1]"));
	confirmpasswordField.sendKeys("Robot@120");
			
	Thread.sleep(1000);
			
	WebElement createAnAccount = driver.findElement(By.xpath("(//span[text()='Create an Account'])[1]"));
	createAnAccount.click();
			
	Thread.sleep(1000);
			
	WebElement searchButton = driver.findElement(By.xpath("(//input[@class='input-text'])[1]"));
	searchButton.sendKeys("Hoodies and sweatshirt for men for hemp material");
			
	Thread.sleep(1000);
			
			
	WebElement searchICon = driver.findElement(By.xpath("//button[@class='action search']"));
	searchICon.click();
			
			
	Thread.sleep(1000);
			
	WebElement sortByDropdown = driver.findElement(By.id("sorter"));
	Select sc = new Select(sortByDropdown);
	sc.selectByValue("price");
			
	Thread.sleep(1000);
	
	String parentHandle = driver.getWindowHandle();
	System.out.println("parent window - +parentHandle");
			
	Actions act = new Actions(driver);
	WebElement selectPhoto1 = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[10]"));

			
	act.contextClick(selectPhoto1).build().perform();
			    
	Thread.sleep(1000);
			   
	Robot rbt1 = new Robot();
	rbt1.keyPress(KeyEvent.VK_DOWN);
	rbt1.keyRelease(KeyEvent.VK_DOWN);
				
	rbt1.keyPress(KeyEvent.VK_DOWN);
	rbt1.keyRelease(KeyEvent.VK_DOWN);
				
	Thread.sleep(1000);
	rbt1.keyPress(KeyEvent.VK_ENTER);
	rbt1.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> handles = driver.getWindowHandles();
	for (String handle : handles) {
		
		driver.switchTo().window(handle);
	
	}
	
			
			
	 WebElement sizeSelect = driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]"));
	 sizeSelect.click();
			
	 Thread.sleep(1000);
			
	 WebElement colorSelect = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[1]"));
	 colorSelect.click();
			
	 Thread.sleep(1000);
			
	 WebElement quantityBox = driver.findElement(By.xpath("//input[@id='qty']"));
     quantityBox.click();
	 quantityBox.clear();
	 quantityBox.sendKeys("4");
			
	 Thread.sleep(1000);
			
	 WebElement addToCartButton = driver.findElement(By.id("product-addtocart-button"));
	 addToCartButton.click();
			
	 driver.switchTo().window(parentHandle);
			
	 Actions act1 = new Actions(driver);
	 WebElement selectPhoto2 = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[10]"));

					
	 act1.contextClick(selectPhoto2).build().perform();
					    
	 Thread.sleep(1000);
					   
	 Robot rbt2 = new Robot();
	 rbt2.keyPress(KeyEvent.VK_DOWN);
	 rbt2.keyRelease(KeyEvent.VK_DOWN);
						
	 rbt2.keyPress(KeyEvent.VK_DOWN);
	 rbt2.keyRelease(KeyEvent.VK_DOWN);
						
	 Thread.sleep(1000);
	 rbt2.keyPress(KeyEvent.VK_ENTER);
	 rbt2.keyRelease(KeyEvent.VK_ENTER);
			
	 Set<String> handles1 = driver.getWindowHandles();
	 for (String handle : handles1) {
				
			driver.switchTo().window(handle);
			
	 }
			
			
	 WebElement sizeSelect1 = driver.findElement(By.xpath("(//div[@class='swatch-option text'])[4]"));
	 sizeSelect1.click();
			
	 Thread.sleep(1000);
			
	 WebElement colorSelect1 = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]"));
	 colorSelect1.click();
			
	 Thread.sleep(1000);
			
	 WebElement quantityBox1 = driver.findElement(By.xpath("//input[@id='qty']"));
	 quantityBox1.click();
	 quantityBox1.clear();
	 quantityBox1.sendKeys("1");
			
	 Thread.sleep(1000);
			
	 WebElement addToCartButton1 = driver.findElement(By.id("product-addtocart-button"));
	 addToCartButton1.click();
			
	 Thread.sleep(1000);
			
	 WebElement cartButton = driver.findElement(By.className("minicart-wrapper"));
	 cartButton.click();
	 			
	//		Alert alert = driver.switchTo().alert();
			
			driver.findElement(By.className("action viewcart")).click();
		//	alert.accept();
			
		
//			
//			WebElement viewCart = driver.findElement(By.xpath("(//div[@class='secondary'])[3]"));
//			viewCart.click();
			
			
//			
			driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
			    
		     WebElement firstQuantity = driver.findElement(By.xpath("(//input[@class='input-text qty'])[1]"));
			 firstQuantity.click();
			 firstQuantity.clear();
			 firstQuantity.sendKeys("2");
			    
			 Thread.sleep(1000);
			    
			    
			 WebElement secondQuantity = driver.findElement(By.xpath("(//input[@class='input-text qty'])[2]"));
			 secondQuantity.click();
			 secondQuantity.clear();
			 secondQuantity.sendKeys("2");
			    
			 Thread.sleep(1000);
				
		     WebElement updateCart = driver.findElement(By.xpath("(//button[@name='update_cart_action'])[2]"));
		     updateCart.click();
				
		     Thread.sleep(1000);
				
			 driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
			 
			
			 WebElement emailButton = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
			 emailButton.sendKeys("robot120@gmail.com");
			 
			 Thread.sleep(5000);
			 
			 WebElement passButton = driver.findElement(By.xpath("//input[@id='customer-password']"));
			 passButton.sendKeys("Robot@120");
			
			 WebElement firstName1 = driver.findElement(By.name("firstname"));
			 firstName1.sendKeys("ABC");
//			
//			 WebElement emailAddress = driver.findElement(By.xpath("(//input[@id='customer-email'])[1]"));
//         	 emailAddress.sendKeys("robot120@gmail.com");
			
			
    //     	(//input[@name='username'])[2]
			
			
			
			
			
			
			
			
			
			
			
	}

}
