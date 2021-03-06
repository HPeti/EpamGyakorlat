package TestSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class Test_Steps {
    private static WebDriver driver;
    WebDriverWait wait;
    WebElement element;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        driver = new FirefoxDriver();
        wait= new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() {
        driver.get("http://www.gmail.com");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws InterruptedException {
        driver.findElement(By.id("identifierId")).sendKeys("mrasd8522");
        driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
        Thread.sleep(1000);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")));
        element.sendKeys("cisco123");
        driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() {
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("gb_71")).click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() {
        System.out.println("LogOut Successfully");
        driver.close();
    }
}