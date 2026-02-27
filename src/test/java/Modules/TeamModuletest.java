package Modules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DTITWebsite.DTITTest;

public class TeamModuletest extends DTITTest {
	
	@Test
	public void Team() throws InterruptedException {
		System.out.println("=============Meet the Team================= ");

		WebDriverWait waitTeam = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait & locate Team CTA / Nav link
		WebElement team = waitTeam.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//a[@data-testid='nav-link-team']/../..//a[text()='Team']"))
		);

		// TC1: Team visible
		System.out.println("TC1 - Team visible: " +
		        (team.isDisplayed() ? "PASS" : "FAIL"));

		// TC2: Team enabled/clickable
		System.out.println("TC2 - Team enabled: " +
		        (team.isEnabled() ? "PASS" : "FAIL"));

		// TC3: Click Team
		team.click();
		System.out.println("TC3 - Team clicked successfully: PASS");

		// TC4: Verify navigation to Team page (URL or header check)
		waitTeam.until(ExpectedConditions.or(
		        ExpectedConditions.urlContains("team"),
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Team')]"))
		));

		String currentUrlTeam = driver.getCurrentUrl();
		System.out.println("TC4 - Navigated to Team page: " +
		        (currentUrlTeam.toLowerCase().contains("team") ? "PASS" : "FAIL"));
		
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
        
        WebElement element = driver.findElement(By.xpath("//h3[text()='Data Analytics Team']"));
	    new Actions(driver)
	        .scrollToElement(element)
	        .perform();
	    
	    
	    System.out.println("=============NodeJS Team================= ");

	    WebDriverWait waitNode = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Locate NodeJS Team element
	    WebElement nodeJsTeam = waitNode.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='NodeJS Team']")
	            )
	    );

	    // TC1: NodeJS Team visible
	    System.out.println("TC1 - NodeJS Team visible: " +
	            (nodeJsTeam.isDisplayed() ? "PASS" : "FAIL"));

	    // TC2: NodeJS Team clickable/enabled
	    System.out.println("TC2 - NodeJS Team clickable: " +
	            (nodeJsTeam.isEnabled() ? "PASS" : "FAIL"));

	    // TC3: Click NodeJS Team (your exact syntax)
	    driver.findElement(By.xpath("//h3[text()='NodeJS Team']")).click();
	    System.out.println("TC3 - NodeJS Team clicked successfully: PASS");

	    // TC4: Verify list/details shown after click (example: team members visible)
	    WebElement nodeJsList = waitNode.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='NodeJS Team']/following::div[1]")) 
	    );
	    System.out.println("TC4 - NodeJS Team list displayed after click: " +
	            (nodeJsList.isDisplayed() ? "PASS" : "FAIL"));

	    driver.findElement(By.xpath("//h3[text()='NodeJS Team']")).click();
	    
	    System.out.println("=============Flutter Team================= ");

	    WebDriverWait waitFlutter = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Locate Flutter Team element
	    WebElement flutterTeam = waitFlutter.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='Flutter Team']")
	            )
	    );

	    // TC1: Flutter Team visible
	    System.out.println("TC1 - Flutter Team visible: " +
	            (flutterTeam.isDisplayed() ? "PASS" : "FAIL"));

	    // TC2: Flutter Team clickable/enabled
	    System.out.println("TC2 - Flutter Team clickable: " +
	            (flutterTeam.isEnabled() ? "PASS" : "FAIL"));

	    // TC3: Click Flutter Team (same syntax style as NodeJS)
	    driver.findElement(By.xpath("//h3[text()='Flutter Team']")).click();
	    System.out.println("TC3 - Flutter Team clicked successfully: PASS");

	    // TC4: Verify Flutter Team list/details shown after click
	    WebElement flutterList = waitFlutter.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='Flutter Team']/following::div[1]") 
	            )
	    );
	    System.out.println("TC4 - Flutter Team list displayed after click: " +
	            (flutterList.isDisplayed() ? "PASS" : "FAIL"));
	    driver.findElement( By.xpath("//h3[text()='Flutter Team']")).click();
	    
	    System.out.println("=============React Team================= ");

	    WebDriverWait waitReact = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Locate React Team element
	    WebElement reactTeam = waitReact.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='React Team']")
	            )
	    );

	    // TC1: React Team visible
	    System.out.println("TC1 - React Team visible: " +
	            (reactTeam.isDisplayed() ? "PASS" : "FAIL"));

	    // TC2: React Team clickable/enabled
	    System.out.println("TC2 - React Team clickable: " +
	            (reactTeam.isEnabled() ? "PASS" : "FAIL"));

	    // TC3: Click React Team (same syntax style)
	    driver.findElement(By.xpath("//h3[text()='React Team']")).click();
	    System.out.println("TC3 - React Team clicked successfully: PASS");

	    // TC4: Verify React Team list/details shown after click
	    WebElement reactList = waitReact.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='React Team']/following::div[1]") 
	            )
	    );
	    System.out.println("TC4 - React Team list displayed after click: " +
	            (reactList.isDisplayed() ? "PASS" : "FAIL"));
	    
	    driver.findElement( By.xpath("//h3[text()='React Team']")).click();

	    System.out.println("=============PHP Team================= ");

	    WebDriverWait waitPhp = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Locate PHP Team element
	    WebElement phpTeam = waitPhp.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='PHP Team']")
	            )
	    );

	    // TC1: PHP Team visible
	    System.out.println("TC1 - PHP Team visible: " +
	            (phpTeam.isDisplayed() ? "PASS" : "FAIL"));

	    // TC2: PHP Team clickable/enabled
	    System.out.println("TC2 - PHP Team clickable: " +
	            (phpTeam.isEnabled() ? "PASS" : "FAIL"));

	    // TC3: Click PHP Team (same syntax style)
	    driver.findElement(By.xpath("//h3[text()='PHP Team']")).click();
	    System.out.println("TC3 - PHP Team clicked successfully: PASS");

	    // TC4: Verify PHP Team list/details shown after click
	    WebElement phpList = waitPhp.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//h3[text()='PHP Team']/following::div[1]") 
	            )
	    );
	    System.out.println("TC4 - PHP Team list displayed after click: " +
	            (phpList.isDisplayed() ? "PASS" : "FAIL"));
	    driver.findElement( By.xpath("//h3[text()='PHP Team']")).click();
	    
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
	    
	    driver.findElement(By.xpath("//a[@data-testid='nav-link-team']/../..//a[text()='Team']")).click();
	    Thread.sleep(1000);
	    
	    WebElement element2 = driver.findElement(By.xpath("//a[text()='Privacy']"));
	    new Actions(driver)
	        .scrollToElement(element2)
	        .perform();

}
}
