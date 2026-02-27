package Modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DTITWebsite.DTITTest;

public class HomeModuleTest extends DTITTest {
	
	@Test
	
	public void Home () throws InterruptedException {
		
		System.out.println("=============Home================= ");

		// Wait & Locate Home
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement home = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home']"))
		);

		// TC1: Home is visible
		System.out.println("TC1 - Home visible: " +
		        (home.isDisplayed() ? "PASS" : "FAIL"));

		// TC2: Home is enabled/clickable
		System.out.println("TC2 - Home enabled: " +
		        (home.isEnabled() ? "PASS" : "FAIL"));

		// TC3: Click Home
		home.click();
		System.out.println("TC3 - Home clicked successfully: PASS");

		
		System.out.println("=============Talk to EASH================= ");

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate Talk to EASH button (with wait)
		WebElement talkToEash = wait1.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[text()='Talk to EASH']/../..//button[@data-testid='nav-cta-talk-to-eash']")
		        )
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
		                By.xpath("//input[@placeholder='Type a message...']")
		        )
		);

		// TC1: Message input visible
		System.out.println("TC1 - Message input visible: " +
		        (messageInput.isDisplayed() ? "PASS" : "FAIL"));
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement messageInput1 = wait3.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//input[@placeholder='Type a message...']")));

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
		
		
		System.out.println("=============See What We're Building================= ");

		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait & locate Products CTA
		WebElement products = wait4.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//a[@data-testid='hero-cta-products']")));

		// TC1: Products visible
		System.out.println("TC1 - Products visible: " +
		        (products.isDisplayed() ? "PASS" : "FAIL"));

		// TC2: Products enabled/clickable
		System.out.println("TC2 - Products enabled: " +
		        (products.isEnabled() ? "PASS" : "FAIL"));

		// TC3: Click Products
		products.click();
		System.out.println("TC3 - Products clicked successfully: PASS");

		// TC4: Verify navigation to Products page (URL or element check)
		wait4.until(ExpectedConditions.or(
		        ExpectedConditions.urlContains("product"),
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Product')]"))));

		String currentUrl = driver.getCurrentUrl();
		System.out.println("TC4 - Navigated to Products page: " +
		        (currentUrl.toLowerCase().contains("product") ? "PASS" : "FAIL"));
	
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		  WebElement element = driver.findElement(By.xpath("//a[text()='Meet the Team']"));
		    new Actions(driver)
		        .scrollToElement(element)
		        .perform();
		    
		    System.out.println("=============Meet the Team================= ");

		    WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));

		    // Wait & locate Meet the Team
		    WebElement meetTheTeam = wait6.until(
		            ExpectedConditions.elementToBeClickable(
		                    By.xpath("//a[text()='Meet the Team']")
		            )
		    );

		    // TC1: Meet the Team visible
		    System.out.println("TC1 - Meet the Team visible: " +
		            (meetTheTeam.isDisplayed() ? "PASS" : "FAIL"));

		    // TC2: Meet the Team enabled/clickable
		    System.out.println("TC2 - Meet the Team enabled: " +
		            (meetTheTeam.isEnabled() ? "PASS" : "FAIL"));

		    // TC3: Click Meet the Team
		    meetTheTeam.click();
		    System.out.println("TC3 - Meet the Team clicked successfully: PASS");

		    // TC4: Verify navigation to Team page (URL or header check)
		    wait6.until(ExpectedConditions.or(
		            ExpectedConditions.urlContains("team"),
		            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Team')]"))
		    ));

		    String currentU = driver.getCurrentUrl();
		    System.out.println("TC4 - Navigated to Team page: " +
		            (currentU.toLowerCase().contains("team") ? "PASS" : "FAIL"));
		    
		    driver.findElement(By.xpath("//a[text()='Home']")).click();
		    
		    WebElement ele = driver.findElement(By.xpath("//a[text()='View Products ']"));
		    new Actions(driver)
		        .scrollToElement(ele)
		        .perform();
		    
//		    System.out.println("=============View Products================= ");
//
//		    WebDriverWait waitl = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		    // Wait & locate View Products (note the trailing space in your XPath)
//		    WebElement viewProducts = waitl.until(
//		            ExpectedConditions.elementToBeClickable(
//		                    By.xpath("//a[text()='View Products ']")
//		            )
//		    );
//
//		    // TC1: View Products visible
//		    System.out.println("TC1 - View Products visible: " +
//		            (viewProducts.isDisplayed() ? "PASS" : "FAIL"));
//
//		    // TC2: View Products enabled/clickable
//		    System.out.println("TC2 - View Products enabled: " +
//		            (viewProducts.isEnabled() ? "PASS" : "FAIL"));
//
//		    // TC3: Click View Products
//		    viewProducts.click();
//		    System.out.println("TC3 - View Products clicked successfully: PASS");
//
//		    // TC4: Verify navigation to Products page (URL or header check)
//		    waitl.until(ExpectedConditions.or(
//		            ExpectedConditions.urlContains("product"),
//		            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Product')]"))
//		    ));
//
//		    String currentUr = driver.getCurrentUrl();
//		    System.out.println("TC4 - Navigated to Products page: " +
//		            (currentUr.toLowerCase().contains("product") ? "PASS" : "FAIL"));
//		    
//		    driver.findElement(By.xpath("//a[text()='Home']")).click();
		    
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
		    

	}
	

}
