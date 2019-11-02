package co.com.kometsales.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductList {

    public static final Target ADD_TO_CART = Target.the("ADD_TO_CART").located(By.xpath("(//a [@class=\"button ajax_add_to_cart_button btn btn-default\"])[1]"));
    public static final Target FIRST_PRODUCT = Target.the("FIRST_PRODUCT").located(By.xpath("(//li[contains(@class, 'ajax_block_product')])[1]"));
}
