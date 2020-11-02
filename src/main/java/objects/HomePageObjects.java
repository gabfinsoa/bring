package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class HomePageObjects extends Utils {

    public HomePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement btnHomePageCuentaYListas;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement inpSearchBar;

    @FindBy(id = "nav-search-submit-text")
    public WebElement btnSearchProduct;

    @FindBy(id = "nav-cart-count")
    public WebElement btnCart;

}
