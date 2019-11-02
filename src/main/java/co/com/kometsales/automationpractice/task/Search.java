package co.com.kometsales.automationpractice.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.kometsales.automationpractice.userinterfaces.HomePage.SEARCH_INPUT;

public class Search implements Task {

private String product;

public Search(String product){
    this.product = product;
}

    @Override
    public <T extends Actor> void performAs(T actor) {

   actor.attemptsTo(
           Enter.theValue(product).into(SEARCH_INPUT).thenHit(Keys.ENTER));
    }

    public static Search product(String product){
        return new Search(product);
    }
}