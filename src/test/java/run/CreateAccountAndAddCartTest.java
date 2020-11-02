package run;

import steps.Hook;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        plugin = {"json:target/amazon/Bring-Json/testResultJson.json", "html:target/amazon/Bring-Html"},
        strict = false,
        glue = ("steps")
)

public class CreateAccountAndAddCartTest extends Hook {
}
