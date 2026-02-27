
package DTITWebsite;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DTITTest {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeSuite
    public void setUpSuite() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://tsitfilemanager.in/vishva/dtit/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

 
   @BeforeMethod
public void resetToHome() {
    driver.get("https://tsitfilemanager.in/vishwa/dtit/");

    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement closeButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@data-testid='eash-close-button']")
                )
        );

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", closeButton);

        System.out.println("EASH popup closed");

    } catch (Exception e) {
        System.out.println("EASH popup not displayed");
    }
}

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
        }
    }
}
