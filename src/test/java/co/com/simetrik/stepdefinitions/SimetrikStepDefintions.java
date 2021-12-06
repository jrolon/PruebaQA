package co.com.simetrik.stepdefinitions;

import co.com.simetrik.steps.SimetrikHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimetrikStepDefintions {

    @Steps
    SimetrikHomePage simetrik;

    @Given("that Jeiner wants to search for the word simetrik")
    public void that_jeiner_wants_to_search_for_the_word_simetrik() {
        simetrik.openSimetrikPage();
    }

    @When("he googles the word")
    public void he_googles_the_word() {
        simetrik.enterTheWorldSearch("simetrik");

    }

    @Then("he looks at the result of the query")
    public void he_looks_at_the_result_of_the_query() throws Exception {
        simetrik.result();
    }
}
