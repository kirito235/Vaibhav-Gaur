package testRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/feature/home.feature",
        glue = "src/test/java/steps/login.java"
)
public class TestRunner {
}
