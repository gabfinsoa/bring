package steps;

import base.InitBeginSectionPage;
import base.InitCreateAccountFormPage;
import base.InitHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountSteps {

    @Given("^I click in Cuenta y Listas$")
    public void iClickInCuentaYListas() {
        InitHomePage.homePageAccountClickButton();
    }

    @When("^I Click Crea Tu Cuenta button$")
    public void iClickCreaTuCuentaButton() {
        InitBeginSectionPage.beginSectionCreaTuCuentaClickButton();
    }

    @And("^I insert the ([^\\\"]*) and ([^\\\"]*)$")
    public void iInsertTheUsernameAndEmail(String userName, String email) {
        InitCreateAccountFormPage.createAccountNombreAndEmailInput(userName, email);
    }

    @And("^I add my ([^\\\"]*) twice$")
    public void iAddMyPasswordTwice(String password) {
        InitCreateAccountFormPage.createAccountPasswordInput(password);
    }

    @Then("^I click in Crea tu Cuenta Amazon button$")
    public void iClickInTheCreaTuCuentaAmazonButton() {
        InitCreateAccountFormPage.createAccountCreaTuCuentaButton();
    }

}
