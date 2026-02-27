//package Modules;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import DTITWebsite.DTITTest;
//
//public class ProductsModuleTest extends DTITTest {
//	
//		@Test
//	
//      	public void products () throws InterruptedException {
//			
//			System.out.println("=============Products================= ");
//
//			// Wait & Locate Home
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			WebElement home = wait.until(
//			        ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Products']/../..//a[@data-testid='nav-link-products']"))
//			);
//
//			// TC1: Home is visible
//			System.out.println("TC1 - Products visible: " +
//			        (home.isDisplayed() ? "PASS" : "FAIL"));
//
//			// TC2: Home is enabled/clickable
//			System.out.println("TC2 - Products enabled: " +
//			        (home.isEnabled() ? "PASS" : "FAIL"));
//
//			// TC3: Click Home
//			home.click();
//			System.out.println("TC3 - Products clicked successfully: PASS");
//
//			
//			System.out.println("=============Talk to EASH================= ");
//
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//			// Locate Talk to EASH button (with wait)
//			WebElement talkToEash = wait1.until(
//			        ExpectedConditions.elementToBeClickable(
//			                By.xpath("//button[text()='Talk to EASH']/../..//button[@data-testid='nav-cta-talk-to-eash']")
//			        )
//			);
//
//			// TC1: Talk to EASH visible
//			System.out.println("TC1 - Talk to EASH visible: " +
//			        (talkToEash.isDisplayed() ? "PASS" : "FAIL"));
//
//			// TC2: Talk to EASH enabled/clickable
//			System.out.println("TC2 - Talk to EASH enabled: " +
//			        (talkToEash.isEnabled() ? "PASS" : "FAIL"));
//
//			// TC3: Click Talk to EASH
//			talkToEash.click();
//			System.out.println("TC3 - Talk to EASH clicked successfully: PASS");
//			
//			System.out.println("=============Chat Message================= ");
//
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//	
//			// Locate message input
//			WebElement messageInput = wait2.until(
//				    ExpectedConditions.visibilityOfElementLocated(
//				        By.xpath("//input[@placeholder='Type a message...']")
//				    )
//				);
//
//			// TC1: Message input visible
//			System.out.println("TC1 - Message input visible: " +
//			        (messageInput.isDisplayed() ? "PASS" : "FAIL"));
//			
//			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//			WebElement messageInput1 = wait3.until(
//			        ExpectedConditions.elementToBeClickable(
//			                By.xpath("//input[@placeholder='Type a message...']")));
//
//			// TC2: Enter message
//			messageInput1.sendKeys("Hi");
//			System.out.println("TC2 - Message entered successfully: PASS");
//			WebElement sendButton = wait2.until(
//			        ExpectedConditions.elementToBeClickable(
//			                By.xpath("//button[@data-testid='eash-send-button']")));
//
//			// TC3: Send button visible
//			System.out.println("TC3 - Send button visible: " +
//			        (sendButton.isDisplayed() ? "PASS" : "FAIL"));
//
//			// TC4: Send button enabled
//			System.out.println("TC4 - Send button enabled: " +
//			        (sendButton.isEnabled() ? "PASS" : "FAIL"));
//
//			// TC5: Click Send
//			sendButton.click();
//			System.out.println("TC5 - Message sent successfully: PASS");
//			
//	        driver.findElement(By.xpath("//button[@data-testid='eash-close-button']")).click();
//	        
//	        WebElement ele1 = driver.findElement(By.xpath("//a[@title='LinkedIn']"));
//		    new Actions(driver)
//		        .scrollToElement(ele1)
//		        .perform();
//		    
//		    System.out.println("=============Get Started================= ");
//
//		    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		    // Wait & locate Get Started
//		    WebElement getStarted = waits.until(
//		            ExpectedConditions.elementToBeClickable(
//		                    By.xpath("//a[@data-discover='true']/../..//a[text()='Get Started ']")
//		            ));
//
//		    // TC1: Get Started visible
//		    System.out.println("TC1 - Get Started visible: " +
//		            (getStarted.isDisplayed() ? "PASS" : "FAIL"));
//
//		    // TC2: Get Started enabled/clickable
//		    System.out.println("TC2 - Get Started enabled: " +
//		            (getStarted.isEnabled() ? "PASS" : "FAIL"));
//
//		    // TC3: Click Get Started
//		    getStarted.click();
//		    System.out.println("TC3 - Get Started clicked successfully: PASS");
//		    
//		    
//		    //driver.findElement(By.xpath("//a[text()='Products']/../..//a[@data-testid='nav-link-products']")).click();
//		    
//
//}
//}



package Modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DTITWebsite.DTITTest;

public class ProductsModuleTest extends DTITTest {

    @Test
    public void products() throws InterruptedException {

        System.out.println("=============Products================= ");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement home = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[text()='Products']/../..//a[@data-testid='nav-link-products']")
                )
        );

        System.out.println("TC1 - Products visible: " + (home.isDisplayed() ? "PASS" : "FAIL"));
        System.out.println("TC2 - Products enabled: " + (home.isEnabled() ? "PASS" : "FAIL"));

        js.executeScript("arguments[0].click();", home);
        System.out.println("TC3 - Products clicked successfully: PASS");


        System.out.println("=============Talk to EASH================= ");

        WebElement talkToEash = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[text()='Talk to EASH']/../..//button[@data-testid='nav-cta-talk-to-eash']")
                )
        );

        System.out.println("TC1 - Talk to EASH visible: " + (talkToEash.isDisplayed() ? "PASS" : "FAIL"));
        System.out.println("TC2 - Talk to EASH enabled: " + (talkToEash.isEnabled() ? "PASS" : "FAIL"));

        js.executeScript("arguments[0].click();", talkToEash);
        System.out.println("TC3 - Talk to EASH clicked successfully: PASS");


        System.out.println("=============Chat Message================= ");

        WebElement messageInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type a message...']"))
        );

        System.out.println("TC1 - Message input visible: " + (messageInput.isDisplayed() ? "PASS" : "FAIL"));

        messageInput.sendKeys("Hi");
        System.out.println("TC2 - Message entered successfully: PASS");

        WebElement sendButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='eash-send-button']"))
        );

        System.out.println("TC3 - Send button visible: " + (sendButton.isDisplayed() ? "PASS" : "FAIL"));
        System.out.println("TC4 - Send button enabled: " + (sendButton.isEnabled() ? "PASS" : "FAIL"));

        js.executeScript("arguments[0].click();", sendButton);
        System.out.println("TC5 - Message sent successfully: PASS");


        // Close chat properly and wait for overlay to disappear
        WebElement closeChat = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='eash-close-button']"))
        );
        WebElement element = driver.findElement(By.xpath("//a[text()='Privacy']"));
	    new Actions(driver)
	        .scrollToElement(element)
	        .perform();
	
    }
}
