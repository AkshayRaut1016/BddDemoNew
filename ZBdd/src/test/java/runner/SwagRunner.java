package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature"},
		glue = {"swagstep"},
        monochrome = true, tags = "@smoke"
        )




public class SwagRunner {

}
