package TestRunners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Peter_Hegedus2\\Desktop\\Programs\\Seleniumblogcreating\\src\\main\\resources\\blog.feature"
        ,glue = {"TestSteps"}
)
public class TestRunner {
}
