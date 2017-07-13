package CorrectedStepDefinitions;

import Utility.Screenshot;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TestSteps {
    Screenshot screenshot = new Screenshot();
    private static WebDriver driver;
    WebDriverWait wait;
    static Logger log = Logger.getLogger(TestSteps.class);

    @Before
    public void openDriver() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
    }

    @Given("^the use is on the gmail login page$")
    public void the_use_is_on_the_gmail_login_page() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/gmail/about/");
        driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
    }

    @When("^tries to go to the enter password page without entering the email or username$")
    public void tries_to_go_to_the_enter_password_page_without_entering_the_email_or_username() throws Throwable {

        driver.findElement(By.cssSelector(".ZFr60d.CeoRYc")).click();
    }

    @Then("^the enter an email or phone number error message should be displayed$")
    public void the_enter_an_email_or_phone_number_error_message_should_be_displayed() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        boolean condition=driver.findElement(By.cssSelector(".dEOOab.RxsGPe")).isDisplayed();
        if (condition) {
            Assert.assertTrue(condition);
            log.info("email or phone not entered");
        }
        else {
            screenshot.getScreenshot(driver);
            Assert.assertTrue(condition);
        }
    }

    @When("^the user enters a not existing email or username$")
    public void the_user_enters_a_not_existing_email_or_username() throws Throwable {
        String chars = "abcdefghijklmnopqrstuvxyz1234567890";
        StringBuilder builder = new StringBuilder();
        Random r = new Random();
        while (builder.length() < 18) {
            int index = (int) (r.nextFloat() * chars.length());
            builder.append(chars.charAt(index));
        }
        String randomEmail = builder.toString();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("identifierId")).sendKeys(randomEmail);
        driver.findElement(By.cssSelector(".ZFr60d.CeoRYc")).click();
    }

    @Then("^the Couldn't find your Google Account error messahe should be displayed$")
    public void the_Couldn_t_find_your_Google_Account_error_messahe_should_be_displayed() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.cssSelector(".dEOOab.RxsGPe")).isDisplayed());
    }

    @When("^the user enters a valid username or password$")
    public void the_user_enters_a_valid_username_or_password() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("identifierId")).sendKeys("mrasd8522@gmail.com");
        driver.findElement(By.cssSelector(".ZFr60d.CeoRYc")).click();
    }

    @And("^the user enters an invalid password$")
    public void the_user_enters_an_invalid_password() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("RandomPassword123");
        driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
    }

    @Then("^the Wrong password\\. Try again\\. error message should be displayed$")
    public void the_Wrong_password_Try_again_error_message_should_be_displayed() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        boolean condition=driver.findElement(By.cssSelector(".dEOOab.RxsGPe")).isDisplayed();
        if (condition) {
            Assert.assertTrue(condition);
            log.info("error messeage displayed");
        }
        else {
            screenshot.getScreenshot(driver);
            Assert.assertTrue(condition);
        }
    }

    @And("^the user enters an valid password$")
    public void the_user_enters_an_valid_password() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("cisco123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='passwordNext']/content/span")));
        driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
    }

    @Then("^the user should be on the home page$")
    public void the_user_should_be_on_the_home_page() throws Throwable {
        wait.until(ExpectedConditions.titleContains("Inbox"));
        boolean condition = driver.getTitle().contains("Inbox");
        if (condition) {
            Assert.assertTrue(condition);
            log.info("Info: User is on home page");
        }
        else {
            screenshot.getScreenshot(driver);
            Assert.assertTrue(condition);
        }
    }

    @After
    public void closeDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
