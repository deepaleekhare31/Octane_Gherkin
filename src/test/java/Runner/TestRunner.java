package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Program Files (x86)\\Jenkins\\workspace\\Octane\\src\\test\\java\\features",
 glue={"StepDefinitions"},
 plugin = {"pretty", "junit:target/cucumber.xml"}
 )

public class TestRunner {
}
