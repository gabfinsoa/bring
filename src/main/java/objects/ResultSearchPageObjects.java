package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class ResultSearchPageObjects extends Utils {

    public ResultSearchPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sp-cc-accept")
    public WebElement btnAcceptCookies;

    @FindBy(css = "div[data-asin*=B07PHNFH1P]")
    public WebElement btnSelectProduct;

}
