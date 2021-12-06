package co.com.simetrik.runners;



import io.cucumber.core.snippets.SnippetType;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/simetrik.feature",
        glue = "co.com.simetrik.stepdefinitions"
)

public class SimetrikRunner {
}
