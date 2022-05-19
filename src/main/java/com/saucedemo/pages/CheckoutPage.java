package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishBtn;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement message;



    public void clickOnCheckOutButton() {
        log.info("select Cheapest Product : " + checkout.toString() + "<br>");
        clickOnElement(checkout);
    }

    public void enterFirstName(String name) {
        log.info("Enter FirstName : " + firstname.toString() + "<br>");
        sendTextToElement(firstname, name);
    }

    public void enterLastName(String lastname) {
        log.info("Enter LastName : " + lname.toString() + "<br>");
        sendTextToElement(lname, lastname);
    }

    public void enterPostCode(String PostCode) {
        log.info("Enter PostCode : " + postcode.toString() + "<br>");
        sendTextToElement(postcode, PostCode);
    }

    public void clickContinueButton() {
        log.info("Enter PostCode : " + continueBtn.toString() + "<br>");
        clickOnElement(continueBtn);
    }

    public void clickOnFinishButton() {
        log.info("Enter PostCode : " + finishBtn.toString() + "<br>");
        clickOnElement(finishBtn);
    }

    public String verifyThankYouText() {
        log.info("Verify Thank You Text : " + message.toString() + "<br>");
        return getTextFromElement(message);
    }


}
