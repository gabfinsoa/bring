package base;

import actions.HomePageActions;
import capabilities.Capabilities;

public class InitHomePage {

    public static Capabilities caps = new Capabilities();
    static HomePageActions homePageActions = new HomePageActions(caps.driver);

    public static void homePageAccountClickButton() {
        homePageActions.doClickCuentaYListasAction();
    }

    public static void homePageSearchProductNameInput(String product) {
        homePageActions.doSearchProductNameAction(product);
    }

    public static void homePageSearchProductClickButton() {
        homePageActions.doSearchProductClickAction();
    }

    public static void homePageCartClickButton() {
        homePageActions.doClickCartButtonAction();
    }

}
