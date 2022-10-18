package com.stepdefinitions;

import com.pageobject.FooterSection;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterSectionStep extends BaseStepDefinition {
    private final FooterSection footerSection = new FooterSection(driver);

    @When("I navigate to the main page")
    public void i_navigate_to_the_main_page() {
        driver.navigate().to(BASE_URL);
    }

    @Then("Disclaimer footer menu item {string} url should point to the right page")
    public void disclaimerFooterMenuItemUrlShouldPointToTheRightPage(String url) {
        footerSection.checkIfDisclaimerFooterMenuUrlPointToTheRightPage(url);
    }

    @Then("Advertise footer menu item {string} url should point to the right page")
    public void advertiseFooterMenuItemShouldPointToTheRightPage(String url) {
        footerSection.checkIfAdvertiseFooterMenuUrlPointToTheRightPage(url);
    }

    @Then("Disclosure footer menu item {string} url should point to the right page")
    public void disclosureFooterMenuItemUrlShouldPointToTheRightPage(String url) {
        footerSection.checkIfDisclosureFooterMenuUrlPointToTheRightPage(url);
    }

    @Then("Privacy Policy footer menu item {string} url should point to the right page")
    public void privacyPolicyFooterMenuItemUrlShouldPointToTheRightPage(String url) {
        footerSection.checkIfPrivacyPolicyFooterMenuUrlPointToTheRightPage(url);
    }

    @Then("Contact footer menu item {string} url should point to the right page")
    public void contactFooterMenuItemUrlShouldPointToTheRightPage(String url) {
        footerSection.checkIfContactFooterMenuUrlPointToTheRightPage(url);
    }

    @Then("About footer menu item {string} url should point to the right page")
    public void aboutFooterMenuItemUrlShouldPointToTheRightPage(String url) {
        footerSection.checkIfAboutFooterMenuUrlPointToTheRightPage(url);
    }

    @Then("the footer menu item 'To top arrow' {string} url should point to the main page")
    public void theFooterMenuItemUrlShouldPointToTheMainPage(String url) {
        footerSection.checkIfToTopArrowFooterMenuUrlPointToTheRightPage(url);
    }
}
