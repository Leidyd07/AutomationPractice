package co.com.kometsales.automationpractice.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.kometsales.automationpractice.userinterfaces.ProductList.ADD_TO_CART;
import static co.com.kometsales.automationpractice.userinterfaces.ProductList.FIRST_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIRST_PRODUCT),
                Click.on(ADD_TO_CART));
    }

    public static AddProduct add() {
        return instrumented(AddProduct.class);
    }
}