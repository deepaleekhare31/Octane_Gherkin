package Runner;

import com.hpe.alm.octane.OctaneCucumber;
import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import cucumber.api.CucumberOptions;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"stepDefinitions"},
//		tags= {"@TID4120175REV0.2.0"},
		tags= {"@TID4140125REV0.2.0"},
		plugin={"junit:target/cucumber.xml"}
		)

public class TestRunner {
}