package co.com.challengeversion.one.stepdefinitions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

import com.ibm.icu.impl.ICUBinary.Authenticate;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import co.com.challengeversion.one.task.OpentheAplication;
import co.com.challengeversion.one.userinterfaces.ChallengeVersionOneHomePage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChallengeVersionOneLoginStepdefinitions {
	//Inicializamos Driver
	@Managed(driver = "chorme")
	private WebDriver TheBrowser;
	
	private ChallengeVersionOneHomePage wordpresshomepage;
	// Metodo para asociar el actor
	private Actor user = Actor.named("user");
	@Before
	public void setup(){
		user.can(BrowseTheWeb.with(TheBrowser));
	}
	
	@Given("^that the (.*) want do login in the (.*)$")
	public void thatTheUserWantDoLoginInTheApplication() throws Exception {
		user.wasAbleTo(OpentheAplication.at(wordpresshomepage));
	    user.wasAbleTo(OpentheAplication.at(null));
	   	}
	
	@When("^he enter credentials$")
	public void heEnterCredentials(List<String> credentials) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    user.wasAbleTo(Authenticate.withThe(credentials));
	}

	@Then("^he must access the homepage$")
	public void heMustAccessTheHomepage() throws Exception {
	   user.should(seeThat(TheResultAccountPage.is(, containsString("Hola, "))
			  .orComplainWith(CauseResultNotWaited.class, "Loguin errado"));
	}
}
