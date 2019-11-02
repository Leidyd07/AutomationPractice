package co.com.kometsales.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.kometsales.automationpractice.userinterfaces.Cart.MSJ_CART;

public class MessageCart implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MSJ_CART).viewedBy(actor).asString();
    }

    public static MessageCart is(){
        return new MessageCart();
    }
}