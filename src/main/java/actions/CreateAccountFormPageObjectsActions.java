package actions;

import objects.CreateAccountFormPageObjects;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class CreateAccountFormPageObjectsActions extends CreateAccountFormPageObjects {

    public CreateAccountFormPageObjectsActions(WebDriver driver) {
        super(driver);
    }

    Random random = new Random();
    int number = random.nextInt(999);

    public void doFillInputNameAndEmailFormAction(String username, String email) {
        waitElement(inpUserNameCreateAccount);
        sendKeysElement(inpUserNameCreateAccount, username + " " + number);
        sendKeysElement(inpEmailCreateAccount, email + number + "@email.com");
    }

    public void doFillInputPasswordFormAction(String password) {
        waitElement(inpPasswordCreateAccount);
        sendKeysElement(inpPasswordCreateAccount, password);
        sendKeysElement(inpPasswordCheckCreateAccount, password);
    }

    public void doClickCreaTuCuentaAmazonFormAction() {
        waitElement(btnContinueCreateAccount);
        clickElement(btnContinueCreateAccount);
    }

}
