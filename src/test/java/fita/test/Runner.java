package fita.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"featuresBDD/Test.feature"},
glue = {"StepDefinition"},tags="@smoke",plugin = {"pretty","html:target/HTMLreports.html"})
public class Runner extends AbstractTestNGCucumberTests {

	
}
