package com.saucedemo.steps;

import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.MainPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PurchaseSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {
     new LoginPage().enterUsername(username);
     new LoginPage().enterPassword(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice()  {

        new MainPage().selectFilter();
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new MainPage().selectCheapestProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new MainPage().clickOnCheckOut();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckoutPage().clickOnCheckOutButton();
    }

    @And("^I enter details firstname \"([^\"]*)\" lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String name, String lastname, String PostCode)  {
        new CheckoutPage().enterFirstName(name);
        new CheckoutPage().enterLastName(lastname);
        new CheckoutPage().enterPostCode(PostCode);

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckoutPage().clickOnFinishButton();
    }



    @And("^I filter the products by Price high to low$")
    public void iFilterTheProductsByPriceHighToLow() {
        new MainPage().selectFilter();
    }

    @Then("^I should be able to see message THANK YOU FOR YOUR ORDER$")
    public void iShouldBeAbleToSeeMessageTHANKYOUFORYOURORDER() {
        String expectedMessage = "THANK YOU FOR YOUR ORDER";
        String actualMessage = new CheckoutPage().verifyThankYouText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
}
