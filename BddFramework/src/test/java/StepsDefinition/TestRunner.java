package StepsDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/praveensharma/eclipse-workspace/BddFramework/Features", glue= {"StepsDefinition"})
public class TestRunner {

}
