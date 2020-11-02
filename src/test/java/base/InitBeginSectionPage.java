package base;

import actions.BeginSectionPageActions;
import capabilities.Capabilities;

public class InitBeginSectionPage {

    public static Capabilities caps = new Capabilities();
    static BeginSectionPageActions beginSectionPageActions = new BeginSectionPageActions(caps.driver);

    public static void beginSectionCreaTuCuentaClickButton() {
        beginSectionPageActions.doClickCreaTuCuentaAction();
    }

}
