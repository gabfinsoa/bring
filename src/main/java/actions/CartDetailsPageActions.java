package actions;

import objects.CartDetailsPageObjects;
import org.openqa.selenium.WebDriver;

public class CartDetailsPageActions extends CartDetailsPageObjects {

    public CartDetailsPageActions(WebDriver driver) {
        super(driver);
    }

    public String doGetProductCartTitleAction() {
        waitElement(lblCartProductTitle);

        return getText(lblCartProductTitle);
    }

    public String doGetProductCartPriceAction() {
        waitElement(lblCartProductPrice);

        return getText(lblCartProductPrice);
    }

}
