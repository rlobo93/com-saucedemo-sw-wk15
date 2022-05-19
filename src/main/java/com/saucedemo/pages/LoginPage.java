package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "user-name")
    WebElement getUsername;

    @CacheLookup
    @FindBy(id = "password")
    WebElement getPassword;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginBtn;


    public void enterUsername(String username) {
        log.info("Enter Username : " + getUsername.toString() + "<br>");
        sendTextToElement(getUsername, username);
    }

    public void enterPassword(String password) {
        log.info("Enter Password : " + getPassword.toString() + "<br>");
        sendTextToElement(getPassword, password);
    }

    public void clickLoginButton() {
        log.info("click Login Button : " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
    }




}

