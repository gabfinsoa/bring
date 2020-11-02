package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CreateAccountFormPageObjects extends Utils {

    public CreateAccountFormPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ap_customer_name")
    public WebElement inpUserNameCreateAccount;

    @FindBy(id = "ap_email")
    public WebElement inpEmailCreateAccount;

    @FindBy(id = "ap_password")
    public WebElement inpPasswordCreateAccount;

    @FindBy(id = "ap_password_check")
    public WebElement inpPasswordCheckCreateAccount;

    @FindBy(id = "continue")
    public WebElement btnContinueCreateAccount;

}
