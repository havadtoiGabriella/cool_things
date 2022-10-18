package com.pageobject;

import static com.data.Attribute.HREF;
import static com.util.WebElementAssertions.elementAttributeHasValue;
import static com.util.WebElementAssertions.elementIsDisplayed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderSection extends BasePage {
    private final By instagramIcon = By.className("fa-instagram");
    private final By facebookIcon = By.className("fa-facebook");
    private final By pinterestIcon = By.className("fa-pinterest-p");
    private final By youTubeIcon = By.className("fa-youtube-play");

    @FindBy(id = "logo")
    private WebElement pageLogo;

    @FindBy(css = "#menu-item-103302 a")
    private WebElement shopMenuItem;

    @FindBy(css = "#menu-item-20387 a")
    private WebElement gadgetsMenuItem;

    @FindBy(css = "#menu-item-54683 a")
    private WebElement giftsMenuItem;

    @FindBy(css = "#menu-item-56424 a")
    private WebElement gearMenuItem;

    @FindBy(css = "#menu-item-55947 a")
    private WebElement toysMenuItem;

    @FindBy(css = "#menu-item-55948 a")
    private WebElement inventionsMenuItem;

    @FindBy(css = "#menu-item-96129 a")
    private WebElement styleMenuItem;

    @FindBy(css = "#menu-item-20389 a")
    private WebElement houseMenuItem;

    @FindBy(css = "#menu-item-20390 a")
    private WebElement ridesMenuItem;

    @FindBy(css = "#menu-item-60801 a")
    private WebElement cladMenuItem;

    @FindBy(css = "a[href='http://www.youtube.com/coolthings']")
    private WebElement youtubeLink;

    @FindBy(css = "#cb-nav-bar a[href='http://www.instagram.com/coolthings']")
    private WebElement instagramLink;

    @FindBy(css = "#cb-nav-bar a[href='http://www.pinterest.com/coolthings']")
    private WebElement pinterestLink;

    @FindBy(css = "#cb-nav-bar a[href='http://www.facebook.com/coolthings']")
    private WebElement facebookLink;

    @FindBy(id = "cb-s-trigger-gen")
    private WebElement searchButton;

    public void checkIfPageLogoIsVisible() {
        LOGGER.info("Checking if page logo is displayed.");
        elementIsDisplayed(pageLogo);
    }

    public void checkIfShopNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Shop' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(shopMenuItem, HREF, url);
    }

    public void checkIfGadgetsNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Gadgets' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(gadgetsMenuItem, HREF, url);
    }

    public void checkIfGiftsNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Gifts' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(giftsMenuItem, HREF, url);
    }

    public void checkIfGearNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Gear' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(gearMenuItem, HREF, url);
    }

    public void checkIfToysNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Toys' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(toysMenuItem, HREF, url);
    }

    public void checkIfInventionsNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Inventions' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(inventionsMenuItem, HREF, url);
    }

    public void checkIfStyleNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Style' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(styleMenuItem, HREF, url);
    }

    public void checkIfHouseNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'House' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(houseMenuItem, HREF, url);
    }

    public void checkIfRidesNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Rides' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(ridesMenuItem, HREF, url);
    }

    public void checkIfCladNavbarMenuItemUrlPointsToTheRightPage(String url) {
        LOGGER.info("Checking if 'Clad' navbar menu item has the correct url: " + url);
        elementAttributeHasValue(cladMenuItem, HREF, url);
    }

    public void validateYouTubeSection() {
        LOGGER.info("Checking if 'YouTube' section is displayed and points toward to correct url.");
        elementIsDisplayed(youtubeLink.findElement(youTubeIcon));
    }

    public void validateInstagramSection() {
        LOGGER.info("Checking if 'Instagram' section is displayed and points toward to correct url.");
        elementIsDisplayed(instagramLink.findElement(instagramIcon));
    }

    public void validatePinterestSection() {
        LOGGER.info("Checking if 'Pinterest' section is displayed and points toward to correct url.");
        elementIsDisplayed(pinterestLink.findElement(pinterestIcon));
    }

    public void validateFacebookSection() {
        LOGGER.info("Checking if 'Facebook' section is displayed and points toward to correct url.");
        elementIsDisplayed(facebookLink.findElement(facebookIcon));
    }

    public void checkIfSearchButtonIsDisplayed() {
        LOGGER.info("Checking if Search button is displayed");
        elementIsDisplayed(searchButton);
    }

    public HeaderSection(ChromeDriver driver) {
        super(driver);
    }
}