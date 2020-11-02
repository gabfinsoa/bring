package actions;

import objects.ProductDetailsPageObjects;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPageActions extends ProductDetailsPageObjects {

    public ProductDetailsPageActions(WebDriver driver) {
        super(driver);
    }

    public String doGetProductTitleAction() {
        waitElement(lblProductTitle);

        return getText(lblProductTitle);
    }

    public String doGetProductPriceAction() {
        waitElement(lblProductPrice);

        return getText(lblProductPrice);
    }

    public void doClickAddProductCartAction() {
        waitElement(btnAddToCart);
        clickElement(btnAddToCart);
    }

}
