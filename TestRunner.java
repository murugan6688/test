package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/mu307892/Documents/GitHub/test/.git/BDDFrameworkCucumber/src/main/java/Feature",
		// plugin = {"pretty", "html:target/cucumber-html-report"},
		// tags = {"@Second"},
		glue={"Stepdefinition"},
		format= {"pretty","html:test-output"}
		// dryRun = true,
		// monochrome = true
		)

public class TestRunner {

}
