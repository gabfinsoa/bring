package base;

import actions.ProductDetailsPageActions;
import capabilities.Capabilities;

public class InitProductDetailsPage {

    public static Capabilities caps = new Capabilities();
    static ProductDetailsPageActions productDetailsPageActions = new ProductDetailsPageActions(caps.driver);

    public static String productDetailsGetTitleLabel() {

        return productDetailsPageActions.doGetProductTitleAction();
    }

    public static String productDetailsGetPriceLabel() {

        return productDetailsPageActions.doGetProductPriceAction();
    }

    public static void productDetailsAddCartClickButton() {
        productDetailsPageActions.doClickAddProductCartAction();
    }

}
