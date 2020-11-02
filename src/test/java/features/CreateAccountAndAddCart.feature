Feature: Bring Create New User Account and add product in the cart
  This feature will add a new user at Amazon.es page and after will
  add a product in the cart.

  @Bring
  Scenario Outline: Insert a new user at Amazon.es page
    Given I click in Cuenta y Listas
    When I Click Crea Tu Cuenta button
    And I insert the <username> and <email>
    And I add my <password> twice
    Then I click in Crea tu Cuenta Amazon button

    Examples:
      | username  | email | password |
      | Fake User | test  | bring123 |


  @Bring
  Scenario Outline: Search product and add in cart
    Given I insert the <product> name in SearchBar
    And I click the Search button
    When I click in the product
    And I get the title of the product
    And I get the price of the product
    And I click in Anadir ala Cesta button
    Then I go to the cart page
    And I validate product title
    And I validate the product price

    Examples:
      | product                             |
      | auelek aspirador de coche sin cable |