package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Magento {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
//		WebElement createAccount = driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
//		createAccount.click();
//		
//		Thread.sleep(1000);
//		
//		WebElement firstName = driver.findElement(By.xpath("(//input[@class='input-text required-entry'])[1]"));
//		firstName.sendKeys("ABC");
//		
//		Thread.sleep(1000);
//		
//		WebElement lastName = driver.findElement(By.xpath("(//input[@class='input-text required-entry'])[2]"));
//		lastName.sendKeys("DEF");
//		
//		Thread.sleep(1000);
//		
//		WebElement emailField = driver.findElement(By.xpath("(//input[(@id='email_address')])[1]"));
//		emailField.sendKeys("robot120@gmail.com");
//		
//		Thread.sleep(1000);
//		
//		WebElement passwordField = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
//		passwordField.sendKeys("Robot@120");
//		
//		Thread.sleep(1000);
//		
//		WebElement confirmpasswordField = driver.findElement(By.xpath("(//input[(@id='password-confirmation')])[1]"));
//		confirmpasswordField.sendKeys("Robot@120");
//		
//		Thread.sleep(1000);
//		
//		WebElement createAnAccount = driver.findElement(By.xpath("(//span[text()='Create an Account'])[1]"));
//		createAnAccount.click();
//		
//		Thread.sleep(1000);
		
//		WebElement signInButton = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/ul/li[2]/a"));
//		signInButton.click();
//		
//		WebElement emailField = driver.findElement(By.xpath("(//input[@class='input-text'])[2]"));
//		emailField.sendKeys("mariajeba61298@gmail.com");
//		
//		WebElement passwordField = driver.findElement(By.xpath("(//input[@id='pass'])[1]"));
//		passwordField.sendKeys("jeba@1226");
//		
//		WebElement signInButton2 = driver.findElement(By.linkText("Sign In[4]"));
//		signInButton2.click();
		
//		driver.get("https://magento.softwaretestingboard.com/customer/account/");
//		
//		driver.manage().window().maximize();
		
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
		
//		Actions act = new Actions(driver);
		WebElement selectPhoto = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[10]"));
		selectPhoto.click();
		
		
//	    act.contextClick(selectPhoto).build().perform();
//	    
//	    Thread.sleep(1000);
//	   
//		Robot rbt = new Robot();
//		rbt.keyPress(KeyEvent.VK_DOWN);
//		rbt.keyRelease(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(1000);
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
//		
//	    driver.get("https://magento.softwaretestingboard.com/teton-pullover-hoodie.html");
//	    driver.manage().window().maximize();
//		
//		
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
		
		driver.navigate().back();
		
		driver.manage().window();
//		
//		Actions act1 = new Actions(driver);
//		WebElement selectPhoto1 = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[10]"));
//		    
//	    act.contextClick(selectPhoto1).build().perform();
//	    
//	    Thread.sleep(1000);
//	   
//		Robot rbt1 = new Robot();
//		rbt1.keyPress(KeyEvent.VK_DOWN);
//		rbt1.keyRelease(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(1000);
//		rbt1.keyPress(KeyEvent.VK_ENTER);
//		rbt1.keyRelease(KeyEvent.VK_ENTER);
		
		driver.get("https://magento.softwaretestingboard.com/teton-pullover-hoodie.html");
		
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
		
//		WebElement clickOnCart = driver.findElement(By.xpath("(//span[@class='counter qty'])[1]"));
//		clickOnCart.click();
		
//		
//		//doubt
//		
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		
////		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
//		
////		WebElement clickOnCart = driver.findElement(By.xpath("(//span[@class='counter qty'])[1]"));
////		clickOnCart.click();
////	//	click("clickOnCart");
//		
//	//	driver.switchTo().alert();
//		
////		WebElement viewCart = driver.findElement(By.className("action showcart"));
////		viewCart.click();
////		
//		
////		WebElement viewCart1 = driver.findElement(By.className("action showcart active"));
////		viewCart1.click();
//		
////		
////		WebElement viewCart = driver.findElement(By.xpath("((//span[@class='counter-label'])[1]"));
////		viewCart.click();
//		
////		driver.switchTo().alert();
////		
////		WebElement clickOnCartAlert = driver.findElement(By.linkText("shopping cart"));
////		clickOnCartAlert.click();
//		
//		
//		
//		
////		WebElement clickOnCart = driver.findElement(By.xpath("(//span[@class='counter qty'])[1]"));
////		clickOnCart.click();
////		
////		Actions ac = new Actions(driver);
////		ac.clickAndHold(clickOnCart);
//		
//		//doubt
//	
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
		
		
//		WebElement proceedToPay = driver.findElement(By.xpath("(//button[@data-role='proceed-to-checkout'])[2]"));
//		proceedToPay.click();
	
////		WebElement proceedToPay1 = driver.findElement(By.linkText("Proceed to Checkout"));
////		proceedToPay1.click();
//		
////		WebElement proceedToCheckout = driver.findElement(By.xpath("(//button[@class='action primary checkout'])[2]"));
////		proceedToCheckout.click();
//		
//		
		driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
//	//	driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
//		
//		driver.manage().window().maximize();
//		
//		
		WebElement emailAddress = driver.findElement(By.xpath("(//input[@id='customer-email'])[1]"));
    	emailAddress.sendKeys("robot120@gmail.com");
    	
    	Thread.sleep(3000);
    	
		WebElement passField = driver.findElement(By.xpath("//input[@id='customer-password']"));
		passField.sendKeys("Robot@120");
		
		Thread.sleep(3000);
		
	    WebElement loginButton = driver.findElement(By.className("action login primary"));
	    loginButton.click();
//	    
//	        
//		
//////		WebElement loginBtn = driver.findElement(By.className("action login primary"));
//////		loginBtn.click();
//////		
//		
////    (//input[@id='customer-password'])   
////		
////		WebElement firstName1 = driver.findElement(By.xpath("(//(input[@class='input-text'])[3]"));
//	//	firstName1.sendKeys("ABC");
//		
////		WebElement lastName1 = driver.findElement(By.xpath("(//input[@class='input-text'])[6]"));
////		lastName1.sendKeys("DEF");
////		
//		WebElement streetAddress = driver.findElement(By.xpath("(//input[@class='input-text'])[6]"));
//		streetAddress.sendKeys("No:8, Gandhi nagar, Tambaram");
//		
//		Thread.sleep(3000);
//		
//		WebElement cityName = driver.findElement(By.xpath("(//input[@class='input-text'])[9]"));
//		cityName.sendKeys("Chennai");
//		
//		Thread.sleep(3000);
//		
//		WebElement stateDropDown = driver.findElement(By.xpath("(//select[@class='select'])[1]"));
//		Select sc2 = new Select(stateDropDown);
//		sc2.selectByValue("563");
//		
//		Thread.sleep(3000);
//		
//		WebElement zipCode = driver.findElement(By.xpath("(//input[@class='input-text'])[11]"));
//		zipCode.sendKeys("600058");
//		
//		Thread.sleep(3000);
//		
//		WebElement countryDropDown = driver.findElement(By.xpath("(//select[@class='select'])[2]"));
//		Select sc3 = new Select(countryDropDown);
//		sc3.selectByValue("IN");
//		
//		Thread.sleep(3000);
//		
//		WebElement phoneNumber = driver.findElement(By.xpath("(//input[@class='input-text'])[12]"));
//		phoneNumber.sendKeys("9876543210");
//		
//		Thread.sleep(3000);
//		
//		WebElement nextButton = driver.findElement(By.className("button action continue primary"));
//		nextButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
	//	action primary checkout
		
		
	}

	private static void clickandHold(WebElement clickOnCart) {
		// TODO Auto-generated method stub
		
	}

	private static void click(String string) {
		// TODO Auto-generated method stub
		
	}

}
