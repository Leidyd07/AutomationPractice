package co.com.kometsales.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target SEARCH_INPUT = Target.the("Search Button").located(By.id("search_query_top"));

}