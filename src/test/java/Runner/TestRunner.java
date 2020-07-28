package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "features",
 glue={"StepDefinitions"},
 plugin = {"pretty", "junit:/target/cucumber.xml"}
 )

public class TestRunner {
//	public static void main(String[] args) throws Exception {
//		JUnitCore.main(TestRunner.class.getName());
//	}
}
