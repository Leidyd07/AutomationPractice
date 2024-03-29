package co.com.kometsales.automationpractice.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/automation_practice.feature",
        glue = {"co.com.kometsales.automationpractice.stepdefinitions"})

public class AddProductRunners { }