package com.stepdefinitions;

import com.pageobject.HeaderSection;
import io.cucumber.java.en.Then;

public class HeaderSectionStep extends BaseStepDefinition {
    private final HeaderSection headerSection = new HeaderSection(driver);

    @Then("the page logo should be visible")
    public void the_page_logo_should_be_visible() {
        headerSection.checkIfPageLogoIsVisible();
    }

    @Then("Shop navbar menu item {string} url should point to the right page")
    public void shop_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfShopNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Gadgets navbar menu item {string} url should point to the right page")
    public void gadgets_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfGadgetsNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Gifts navbar menu item {string} url should point to the right page")
    public void gifts_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfGiftsNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Gear navbar menu item {string} url should point to the right page")
    public void gear_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfGearNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Toys navbar menu item {string} url should point to the right page")
    public void toys_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfToysNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Inventions navbar menu item {string} url should point to the right page")
    public void inventions_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfInventionsNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Style navbar menu item {string} url should point to the right page")
    public void style_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfStyleNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("House navbar menu item {string} url should point to the right page")
    public void house_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfHouseNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Rides navbar menu item {string} url should point to the right page")
    public void rides_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfRidesNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("Clad navbar menu item {string} url should point to the right page")
    public void clad_navbar_menu_item_url_should_point_to_the_right_page(String url) {
        headerSection.checkIfCladNavbarMenuItemUrlPointsToTheRightPage(url);
    }

    @Then("the social section should be displayed as expected")
    public void the_social_section_should_be_displayed_as_expected() {
        headerSection.validateFacebookSection();
        headerSection.validateInstagramSection();
        headerSection.validatePinterestSection();
        headerSection.validateYouTubeSection();
    }

    @Then("Search button should be displayed")
    public void search_button_should_be_displayed() {
        headerSection.checkIfSearchButtonIsDisplayed();
    }
}
