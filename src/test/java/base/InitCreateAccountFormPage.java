package base;

import actions.CreateAccountFormPageObjectsActions;
import capabilities.Capabilities;

public class InitCreateAccountFormPage {

    public static Capabilities caps = new Capabilities();
    static CreateAccountFormPageObjectsActions createAccountFormPageObjectsActions = new CreateAccountFormPageObjectsActions(caps.driver);

    public static void createAccountNombreAndEmailInput(String username, String email) {
        createAccountFormPageObjectsActions.doFillInputNameAndEmailFormAction(username, email);
    }

    public static void createAccountPasswordInput(String password) {
        createAccountFormPageObjectsActions.doFillInputPasswordFormAction(password);
    }

    public static void createAccountCreaTuCuentaButton() {
        createAccountFormPageObjectsActions.doClickCreaTuCuentaAmazonFormAction();
    }

}
