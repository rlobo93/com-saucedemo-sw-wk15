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

public class MainPage extends Utility {

    private static final Logger log = LogManager.getLogger(MainPage.class.getName());

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement hoverfilter;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement selectFilter;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement cheapproduct;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement checkout;


    public void mouseHoveronFilter() {
        log.info("Mouse Hover On Filter : " + hoverfilter.toString() + "<br>");
        mouseHoverToElement(hoverfilter);
    }

    public void selectFilter() {
        log.info("selectFilter : " + selectFilter.toString() + "<br>");
        selectByIndexFromDropDown(selectFilter, 3);
    }

    public void selectCheapestProduct() {
        log.info("select Cheapest Product : " + selectFilter.toString() + "<br>");
        clickOnElement(cheapproduct);
    }

    public void clickOnCheckOut() {
        log.info("click On CheckOut : " + checkout.toString() + "<br>");
        clickOnElement(checkout);
    }





}
