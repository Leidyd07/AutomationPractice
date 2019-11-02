package co.com.kometsales.automationpractice.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenAutomationPractice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url( "http://automationpractice.com")
        );
    }

    public static OpenAutomationPractice open(){
        return instrumented(OpenAutomationPractice.class);
    }
}