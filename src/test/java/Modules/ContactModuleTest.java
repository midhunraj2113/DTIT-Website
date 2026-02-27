package Modules;

import java.time.Duration;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DTITWebsite.DTITTest;

public class ContactModuleTest extends DTITTest {
	
		@Test
		public void contact() throws InterruptedException {
			
			System.out.println("=============Contact================= ");

			WebDriverWait waitContact = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			

			// Wait & locate Contact link
			WebElement contact = waitContact.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath("//a[text()='Contact']/../..//a[@data-testid='nav-link-contact']")
			        )
			);

			// TC1: Contact visible
			System.out.println("TC1 - Contact visible: " +
			        (contact.isDisplayed() ? "PASS" : "FAIL"));

			// TC2: Contact clickable/enabled
			System.out.println("TC2 - Contact clickable: " +
			        (contact.isEnabled() ? "PASS" : "FAIL"));

			// TC3: Click Contact (your exact syntax)
			driver.findElement(By.xpath("//a[text()='Contact']/../..//a[@data-testid='nav-link-contact']")).click();
			System.out.println("TC3 - Contact clicked successfully: PASS");

			// TC4: Verify navigation to Contact page (URL or header check)
			waitContact.until(ExpectedConditions.or(
			        ExpectedConditions.urlContains("contact"),
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Contact')]"))
			));

			String currentUrlContact = driver.getCurrentUrl();
			System.out.println("TC4 - Navigated to Contact page: " +
			        (currentUrlContact.toLowerCase().contains("contact") ? "PASS" : "FAIL"));
			
			
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
			
			System.out.println("=============Your Name Field================= ");

			WebDriverWait waitName = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait & locate Name input field
			WebElement nameField = waitName.until(
			        ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//input[@placeholder='John Doe']")
			        )
			);

			// TC1: Name field visible
			System.out.println("TC1 - Name field visible: " +
			        (nameField.isDisplayed() ? "PASS" : "FAIL"));

			// TC2: Name field enabled/editable
			System.out.println("TC2 - Name field enabled: " +
			        (nameField.isEnabled() ? "PASS" : "FAIL"));

			// TC3: Enter name (your exact syntax)
			driver.findElement(By.xpath("//input[@placeholder='John Doe']")).sendKeys("Midhun");
			System.out.println("TC3 - Name entered successfully: PASS");

			// TC4: Verify name entered successfully
			String enteredName = driver.findElement(By.xpath("//input[@placeholder='John Doe']")).getAttribute("value");
			System.out.println("TC4 - Name value reflected in field: " +
			        (enteredName.equals("Midhun") ? "PASS" : "FAIL"));
			
			System.out.println("=============Email Field================= ");

			WebDriverWait waitEmail = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait & locate Email input field
			WebElement emailField = waitEmail.until(
			        ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//input[@placeholder='john@example.com']")
			        )
			);

			// TC1: Email field visible
			System.out.println("TC1 - Email field visible: " +
			        (emailField.isDisplayed() ? "PASS" : "FAIL"));

			// TC2: Email field enabled/editable
			System.out.println("TC2 - Email field enabled: " +
			        (emailField.isEnabled() ? "PASS" : "FAIL"));

			// TC3: Enter email (fixed syntax)
			driver.findElement(By.xpath("//input[@placeholder='john@example.com']")).sendKeys("midhunraj2113@gmail.com");
			System.out.println("TC3 - Email entered successfully: PASS");

			// TC4: Verify email entered successfully
			String enteredEmail = driver.findElement(By.xpath("//input[@placeholder='john@example.com']")).getAttribute("value");
			System.out.println("TC4 - Email value reflected in field: " +
			        (enteredEmail.equals("midhunraj2113@gmail.com") ? "PASS" : "FAIL"));
			
			
			//driver.findElement(By.xpath("//option[text()='Just Exploring']")).click();
			
			System.out.println("=============I Am a.. Dropdown================= ");

			WebDriverWait waitIam = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait & locate "I Am" dropdown
			WebElement iamDropdown = waitIam.until(
			        ExpectedConditions.elementToBeClickable(
			                By.xpath("//select[@name='visitor_type']")  
			        )
			);

			// TC1: I Am dropdown visible
			System.out.println("TC1 - I Am dropdown visible: " +
			        (iamDropdown.isDisplayed() ? "PASS" : "FAIL"));

			// TC2: I Am dropdown clickable/enabled
			System.out.println("TC2 - I Am dropdown clickable: " +
			        (iamDropdown.isEnabled() ? "PASS" : "FAIL"));

			// TC3: Click dropdown (your exact syntax style)
			driver.findElement(By.xpath("//select[@name='visitor_type']")).click();
			System.out.println("TC3 - I Am dropdown clicked successfully: PASS");

			// TC4: Verify options list is shown (example option visible)
			WebElement iamOptionVisible = waitIam.until(
			        ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//option[text()='Just Exploring']")  // 🔁 replace with actual option text if different
			        )
			);
			System.out.println("TC4 - I Am dropdown options displayed: " +
			        (iamOptionVisible.isDisplayed() ? "PASS" : "FAIL"));

			// TC5: Select value (your exact syntax style)
			driver.findElement(By.xpath("//option[text()='Just Exploring']")).click();
			System.out.println("TC5 - I Am dropdown value selected successfully: PASS");
			
			System.out.println("=============Your Message Textarea================= ");

			WebDriverWait waitMsg = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait & locate Message textarea
			WebElement messageArea = waitMsg.until(
			        ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//textarea[@placeholder='Tell us about your project or inquiry...']")
			        )
			);

			// TC1: Message textarea visible
			System.out.println("TC1 - Message textarea visible: " +
			        (messageArea.isDisplayed() ? "PASS" : "FAIL"));

			// TC2: Message textarea clickable/enabled
			System.out.println("TC2 - Message textarea clickable: " +
			        (messageArea.isEnabled() ? "PASS" : "FAIL"));

			// TC3: Click Message textarea (your exact syntax)
			driver.findElement(By.xpath("//textarea[@placeholder='Tell us about your project or inquiry...']")).click();
			System.out.println("TC3 - Message textarea clicked successfully: PASS");

			// TC4: Enter message
			driver.findElement(By.xpath("//textarea[@placeholder='Tell us about your project or inquiry...']")).sendKeys("good");
			System.out.println("TC4 - Message entered successfully: PASS");

			// TC5: Verify message entered successfully
			String enteredMsg = driver.findElement(By.xpath("//textarea[@placeholder='Tell us about your project or inquiry...']")).getAttribute("value");
			System.out.println("TC5 - Message value reflected in textarea: " +
			        (enteredMsg.contains("test message") ? "PASS" : "FAIL"));
			
			 WebElement ele1 = driver.findElement(By.xpath("//a[@data-discover='true']/../..//a[text()='Get Started ']"));
			    new Actions(driver)
			        .scrollToElement(ele1)
			        .perform();
			    
			    System.out.println("=============Send Message Button================= ");

			    WebDriverWait waitSend = new WebDriverWait(driver, Duration.ofSeconds(10));

			    // Wait & locate Send Message button
			    WebElement sendMessageBtn = waitSend.until(
			            ExpectedConditions.elementToBeClickable(
			                    By.xpath("//button[text()='Send Message']")
			            )
			    );

			    // TC1: Send Message button visible
			    System.out.println("TC1 - Send Message button visible: " +
			            (sendMessageBtn.isDisplayed() ? "PASS" : "FAIL"));

			    // TC2: Send Message button clickable/enabled
			    System.out.println("TC2 - Send Message button clickable: " +
			            (sendMessageBtn.isEnabled() ? "PASS" : "FAIL"));

			    // TC3: Click Send Message button (your exact syntax)
			    driver.findElement(By.xpath("//button[text()='Send Message']")).click();
			    System.out.println("TC3 - Send Message button clicked successfully: PASS");

			   
   }
}