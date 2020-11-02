package actions;

import objects.BeginSectionPageObjects;
import org.openqa.selenium.WebDriver;

public class BeginSectionPageActions extends BeginSectionPageObjects {

    public BeginSectionPageActions(WebDriver driver) {
        super(driver);
    }

    public void doClickCreaTuCuentaAction() {
        waitElement(btnCreateAccountSubmit);
        clickElement(btnCreateAccountSubmit);
    }

}
