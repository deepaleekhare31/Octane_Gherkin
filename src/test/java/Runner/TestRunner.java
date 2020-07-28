package Runner;

import com.hpe.alm.octane.OctaneCucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
 features = "C:\\Program Files (x86)\\Jenkins\\workspace\\Octane\\src\\test\\java\\features",
 glue={"StepDefinitions"},
 plugin = {"junit:target/OctaneGherkinResults.xml"}
 )

public class TestRunner {
}
