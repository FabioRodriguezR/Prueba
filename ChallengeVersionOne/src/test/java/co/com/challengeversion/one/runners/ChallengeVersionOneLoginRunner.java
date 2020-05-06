package co.com.challengeversion.one.runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
//import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//		features = "l/src/test/resources/feature/feature.feature",
		features = "src/test/resources/feature/feature.feature",
		glue = "ChallengeVersionOneLoginRunner",
		tags = "@SuccessfulLogin",
		snippets = SnippetType.CAMELCASE
		)

public class ChallengeVersionOneLoginRunner {

}
