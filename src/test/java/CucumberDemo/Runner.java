package CucumberDemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/CucumberDemo/Registration.feature",tags="@Regression")
public class Runner {

}
