package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Peter_Hegedus2\\Desktop\\Programs\\SeleniumGmailLogin\\src\\main\\resources\\gmailLogin.feature"
        ,glue = {"StepDefinition"}
)
public class TestRunner {


}
