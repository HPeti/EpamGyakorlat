package Test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Peter_Hegedus2\\Desktop\\Programs\\Cucumberbasics\\src\\main\\resources\\test.feature"
        ,glue = {"TestSteps"}
)
public class TestRunner {
}
