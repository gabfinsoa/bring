package actions;

import objects.HomePageObjects;
import org.openqa.selenium.WebDriver;

public class HomePageActions extends HomePageObjects {

    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    public void doClickCuentaYListasAction() {
        waitElement(btnHomePageCuentaYListas);
        clickElement(btnHomePageCuentaYListas);
    }

    public void doSearchProductNameAction(String product) {
        waitElement(inpSearchBar);
        sendKeysElement(inpSearchBar, product);
    }

    public void doSearchProductClickAction() {
        waitElement(btnSearchProduct);
        clickElement(btnSearchProduct);
    }

    public void doClickCartButtonAction() {
        waitElement(btnCart);
        clickElement(btnCart);
    }

}
