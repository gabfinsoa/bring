package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CartDetailsPageObjects extends Utils {

    public CartDetailsPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='a-list-item']//span[contains(text(),'AUELEK Aspirador de Coche Sin')]")
    public WebElement lblCartProductTitle;

    @FindBy(id = "sc-subtotal-amount-buybox")
    public WebElement lblCartProductPrice;


}
