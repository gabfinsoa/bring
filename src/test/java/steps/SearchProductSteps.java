package steps;

import base.InitCartDetailsPage;
import base.InitHomePage;
import base.InitProductDetailsPage;
import base.InitResultSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchProductSteps {

    StepsUtils stepsUtils = new StepsUtils();

    @Given("^I insert the ([^\\\"]*) name in SearchBar$")
    public void iInsertTheProductNameInSearchBar(String product) {
        InitHomePage.homePageSearchProductNameInput(product);
    }

    @And("^I click the Search button$")
    public void iClickTheSearchButton() {
        InitHomePage.homePageSearchProductClickButton();
    }

    @When("^I click in the product$")
    public void iClickInTheProduct() {
        InitResultSearchPage.beginSectionCreaTuCuentaClickButton();
    }

    @And("^I get the title of the product$")
    public void iGetTheTitleOfTheProduct() {
        stepsUtils.setProductTitle(InitProductDetailsPage.productDetailsGetTitleLabel());
    }

    @And("^I get the price of the product$")
    public void iGetThePriceOfTheProduct() {
        stepsUtils.setProductPrice(InitProductDetailsPage.productDetailsGetPriceLabel());
    }

    @And("^I click in Anadir ala Cesta button$")
    public void iClickInAnadirAlaCestaButton() {
        InitProductDetailsPage.productDetailsAddCartClickButton();
    }

    @Then("^I go to the cart page$")
    public void iGoToTheCartPage() {
        InitHomePage.homePageCartClickButton();
    }

    @And("^I validate product title$")
    public void iValidateProductTitle() {
        String productDetailTitle = stepsUtils.getProductTitle();
        String productCartTitle = InitCartDetailsPage.cartDetailsGetTitleLabel();

        Assert.assertEquals(productDetailTitle, productCartTitle);
    }

    @And("^I validate the product price$")
    public void iValidateTheProductPrice() {
        String productDetailPrice = stepsUtils.getProductPrice();
        String productCartPrice = InitCartDetailsPage.cartDetailsGetPriceLabel();

        Assert.assertEquals(productDetailPrice, productCartPrice);
    }

}
