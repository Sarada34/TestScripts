package cucumberFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\OrngHrm.feature",plugin = {"html:ExecutableReports.html"})
public class TestRunner3 extends AbstractTestNGCucumberTests {

	
}
