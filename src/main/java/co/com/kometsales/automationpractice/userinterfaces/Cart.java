package co.com.kometsales.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Cart {
    public static final Target MSJ_CART = Target.the("MSJ_CART").located(By.xpath("//div[@class = 'layer_cart_product col-xs-12 col-md-6']//h2"));
}
