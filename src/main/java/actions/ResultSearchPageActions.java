package actions;

import objects.ResultSearchPageObjects;
import org.openqa.selenium.WebDriver;

public class ResultSearchPageActions extends ResultSearchPageObjects {

    public ResultSearchPageActions(WebDriver driver) {
        super(driver);
    }

    public void doClickSearchedProductAction() {
        waitElement(btnAcceptCookies);
        clickElement(btnAcceptCookies);
        waitElement(btnSelectProduct);
        clickElement(btnSelectProduct);
    }

}
