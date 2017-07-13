package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"}
        ,features = "C:\\Users\\Peter_Hegedus2\\Desktop\\Programs\\SeleniumGmailLogin\\src\\main\\resources\\gmailLogin.feature"
        ,glue = {"StepDefinition"}
//        ,tags = {"~@Test"}
)
public class TestRunner {


}
