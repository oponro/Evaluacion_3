package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinition"})
public class Runner {
	
	
}
