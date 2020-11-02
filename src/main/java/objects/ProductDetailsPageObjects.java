package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class ProductDetailsPageObjects extends Utils {

    public ProductDetailsPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "productTitle")
    public WebElement lblProductTitle;

    @FindBy(id = "priceblock_saleprice")
    public WebElement lblProductPrice;

    @FindBy(id = "add-to-cart-button")
    public WebElement btnAddToCart;

}
