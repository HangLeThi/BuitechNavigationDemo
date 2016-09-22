package buitech.uk.auto;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/BuitechWebsite/buitechWebsite.feature")
public class DefinitionTestSuite {}
