package base;

import actions.ResultSearchPageActions;
import capabilities.Capabilities;

public class InitResultSearchPage {

    public static Capabilities caps = new Capabilities();
    static ResultSearchPageActions resultSearchPageActions = new ResultSearchPageActions(caps.driver);

    public static void beginSectionCreaTuCuentaClickButton() {
        resultSearchPageActions.doClickSearchedProductAction();
    }

}
