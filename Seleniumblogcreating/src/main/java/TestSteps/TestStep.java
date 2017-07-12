package TestSteps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestStep {
    private static WebDriver driver;
    @Before
    public void openDriver() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Given("^the user is on the https://wordpress\\.com/ webpage$")
    public void the_user_is_on_the_https_wordpress_com_webpage() throws Throwable {
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/");
    }

    @Given("^the user navigates to the login page by clicking the Log In button$")
    public void the_user_navigates_to_the_login_page_by_clicking_the_Log_In_button() throws Throwable {
        driver.findElement(By.id("navbar-login-link")).click();
    }

    @When("^the user enters valid credentials$")
    public void the_user_enters_valid_credentials() throws Throwable {
        driver.findElement(By.id("usernameOrEmail")).sendKeys("mrasd8522@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("cisco1234");
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".button.form-button.is-primary")).click();
    }

    @Then("^the user should be on the Home page \\(assert: url should be: https://blogforautotests\\.wordpress\\.com/\\)$")
    public void the_user_should_be_on_the_Home_page_assert_url_should_be_https_blogforautotests_wordpress_com() throws Throwable {
        Thread.sleep(5000);
        org.junit.Assert.assertEquals("Following ‹ Reader — WordPress.com",driver.getTitle());
    }

    @When("^the user clicks the write button$")
    public void the_user_clicks_the_write_button() throws Throwable {
        driver.findElement(By.cssSelector(".masterbar__item.masterbar__item-new")).click();
        Thread.sleep(5000);
    }

    @Then("^the add a new post page should be loaded \\(assert: page title should contain \"([^\"]*)\"\\)$")
    public void the_add_a_new_post_page_should_be_loaded_assert_page_title_should_contain(String arg1) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("New Post"));
    }

    @Then("^the user sets a title$")
    public void the_user_sets_a_title() throws Throwable {
        Thread.sleep(100);
        driver.findElement(By.cssSelector(".textarea-autosize.editor-title__input")).sendKeys("TestTitle");
    }

    @Then("^the user sets a body$")
    public void the_user_sets_a_body() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='primary']/div/div[3]/div[2]/div[1]/div[4]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='tinymce-1']")).sendKeys("a body");
    }

    @Then("^publishes the post$")
    public void publishes_the_post() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='primary']/div/div[3]/div[1]/div[3]/div/button[1]")).click();
        Thread.sleep(10000);
    }

    @Then("^the user navigates to the https://wordpress\\.com/ and the recently created blog post should be visible \\(assert\\)$")
    public void the_user_navigates_to_the_https_wordpress_com_and_the_recently_created_blog_post_should_be_visible_assert() throws Throwable {
        driver.get("https://wordpress.com/");
        Thread.sleep(5000);
    }

    @Then("^clicks the title of the recently created blogpost$")
    public void clicks_the_title_of_the_recently_created_blogpost() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user should be redirected to the blogpost wied page \\(assert: url contains the title\\)$")
    public void the_user_should_be_redirected_to_the_blogpost_wied_page_assert_url_contains_the_title() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user clicks on the edit button$")
    public void the_user_clicks_on_the_edit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^deletes the post by clicking on the Move to trash button$")
    public void deletes_the_post_by_clicking_on_the_Move_to_trash_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^navigates to the https://blogforautotests\\.wordpress\\.com/ page$")
    public void navigates_to_the_https_blogforautotests_wordpress_com_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the post should be deleted \\(assert\\)$")
    public void the_post_should_be_deleted_assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @After
    public void closeDriver()
    {
        driver.close();
    }
}
