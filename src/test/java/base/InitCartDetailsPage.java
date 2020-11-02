package base;

import actions.CartDetailsPageActions;
import capabilities.Capabilities;

public class InitCartDetailsPage {

    public static Capabilities caps = new Capabilities();
    static CartDetailsPageActions cartDetailsPageActions = new CartDetailsPageActions(caps.driver);

    public static String cartDetailsGetTitleLabel() {

        return cartDetailsPageActions.doGetProductCartTitleAction();
    }

    public static String cartDetailsGetPriceLabel() {

        return cartDetailsPageActions.doGetProductCartPriceAction();
    }

}
