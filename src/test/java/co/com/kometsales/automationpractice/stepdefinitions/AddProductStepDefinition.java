package co.com.kometsales.automationpractice.stepdefinitions;

import co.com.kometsales.automationpractice.questions.MessageCart;
import co.com.kometsales.automationpractice.task.AddProduct;
import co.com.kometsales.automationpractice.task.Search;
import co.com.kometsales.automationpractice.task.OpenAutomationPractice;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.kometsales.automationpractice.userinterfaces.ProductList.FIRST_PRODUCT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AddProductStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que (.*) quiere realizar una compra")
    public void que_leidy_quiere_realizar_una_compra( String name) {
        theActorCalled(name).attemptsTo(OpenAutomationPractice.open());
    }

    @When("busca el producto (.*) y lo agrega al carrito")
    public void busca_el_producto( String product) {
        theActorInTheSpotlight().attemptsTo(Search.product(product));
        theActorInTheSpotlight().attemptsTo(Scroll.to((FIRST_PRODUCT)));
        theActorInTheSpotlight().attemptsTo(AddProduct.add());
    }

    @Then("se visualiza el mensaje (.*)")
    public void se_visualiza_el_mensaje (String message) {
        theActorInTheSpotlight().should(seeThat(MessageCart.is(), equalTo(message)));
    }
}