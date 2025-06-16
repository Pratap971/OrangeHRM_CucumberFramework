package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = ".//Features",  // Path to feature files
//   		features = { ".//Features/UserFeatures.feature",".//Features/LoginFeatures.feature" },
//          tags="@regression",
//       tags="@sanity",
//          tags="@sanity or regression",
//        tags="@sanity and regression",
//        		tags="@sanity and not regression",
    glue = "stepdefination",                    // Path to step definitions
// 		   plugin = {"pretty", "junit:target/cucumber-reports.xml"},  // Generates a nice rep
//   plugin = {"pretty", "json:target/cucumber-reports.json"},  // Generates a nice report
 plugin = {"pretty", "html:target/cucumber-reports.html"},  // Generates a nice report
// 	  plugin = {"pretty", "junit:target/cucumber-reports.xml", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
    monochrome = true,  // Makes the console output readable
    dryRun = false // Set to true to validate steps without running tests
)


public class Run {
}

