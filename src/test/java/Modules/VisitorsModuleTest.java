package Modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DTITWebsite.DTITTest;

public class VisitorsModuleTest extends DTITTest {
	
	@Test
	public void Visitors() throws InterruptedException {
		
		System.out.println("=============Visitors================= ");

		WebDriverWait waitVisitors = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait & locate Visitors link
		WebElement visitors = waitVisitors.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//a[text()='Visitors']")
		        )
		);

		// TC1: Visitors visible
		System.out.println("TC1 - Visitors visible: " +
		        (visitors.isDisplayed() ? "PASS" : "FAIL"));

		// TC2: Visitors clickable/enabled
		System.out.println("TC2 - Visitors clickable: " +
		        (visitors.isEnabled() ? "PASS" : "FAIL"));

		// TC3: Click Visitors (your exact syntax)
		driver.findElement(By.xpath("//a[text()='Visitors']")).click();
		System.out.println("TC3 - Visitors clicked successfully: PASS");

		// TC4: Verify navigation to Visitors page (URL or header check)
		waitVisitors.until(ExpectedConditions.or(
		        ExpectedConditions.urlContains("visitors"),
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Visitor')]"))));

		String currentUrlVisitors = driver.getCurrentUrl();
		System.out.println("TC4 - Navigated to Visitors page: " +
		        (currentUrlVisitors.toLowerCase().contains("visitors") ? "PASS" : "FAIL"));
		
		System.out.println("=============Talk to EASH================= ");

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate Talk to EASH button (with wait)
		WebElement talkToEash = wait1.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[text()='Talk to EASH']/../..//button[@data-testid='nav-cta-talk-to-eash']"))
		);

		// TC1: Talk to EASH visible
		System.out.println("TC1 - Talk to EASH visible: " +
		        (talkToEash.isDisplayed() ? "PASS" : "FAIL"));

		// TC2: Talk to EASH enabled/clickable
		System.out.println("TC2 - Talk to EASH enabled: " +
		        (talkToEash.isEnabled() ? "PASS" : "FAIL"));

		// TC3: Click Talk to EASH
		talkToEash.click();
		System.out.println("TC3 - Talk to EASH clicked successfully: PASS");
		
		System.out.println("=============Chat Message================= ");

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate message input
		WebElement messageInput = wait2.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//input[@placeholder='Type a message...']/../..//input[@data-testid='eash-input']")
		        )
		);

		// TC1: Message input visible
		System.out.println("TC1 - Message input visible: " +
		        (messageInput.isDisplayed() ? "PASS" : "FAIL"));
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement messageInput1 = wait3.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//input[@placeholder='Type a message...']/../..//input[@data-testid='eash-input']")));

		// TC2: Enter message
		messageInput1.sendKeys("Hi");
		System.out.println("TC2 - Message entered successfully: PASS");
		WebElement sendButton = wait2.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[@data-testid='eash-send-button']")));

		// TC3: Send button visible
		System.out.println("TC3 - Send button visible: " +
		        (sendButton.isDisplayed() ? "PASS" : "FAIL"));

		// TC4: Send button enabled
		System.out.println("TC4 - Send button enabled: " +
		        (sendButton.isEnabled() ? "PASS" : "FAIL"));

		// TC5: Click Send
		sendButton.click();
		System.out.println("TC5 - Message sent successfully: PASS");
		
        driver.findElement(By.xpath("//button[@data-testid='eash-close-button']")).click();
        
        WebElement ele1 = driver.findElement(By.xpath("//a[@title='LinkedIn']"));
	    new Actions(driver)
	        .scrollToElement(ele1)
	        .perform();
	    
	    System.out.println("=============Get Started================= ");

	    WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait & locate Get Started
	    WebElement getStarted = waits.until(
	            ExpectedConditions.elementToBeClickable(
	                    By.xpath("//a[@data-discover='true']/../..//a[text()='Get Started ']")
	            ));

	    // TC1: Get Started visible
	    System.out.println("TC1 - Get Started visible: " +
	            (getStarted.isDisplayed() ? "PASS" : "FAIL"));

	    // TC2: Get Started enabled/clickable
	    System.out.println("TC2 - Get Started enabled: " +
	            (getStarted.isEnabled() ? "PASS" : "FAIL"));

	    // TC3: Click Get Started
	    getStarted.click();
	    System.out.println("TC3 - Get Started clicked successfully: PASS");
	    
	    driver.findElement(By.xpath("//a[text()='Visitors']")).click();
	    Thread.sleep(1000);
	   
	    
	    WebElement element2 = driver.findElement(By.xpath("//a[text()='Privacy']"));
	    new Actions(driver)
	        .scrollToElement(element2)
	        .perform();
		
		
	}
}
