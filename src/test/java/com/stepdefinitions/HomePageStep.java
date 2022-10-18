package com.stepdefinitions;

import com.pageobject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseStepDefinition {
    private final HomePage homePage = new HomePage(driver);

    @When("I click on the {int} article")
    public void i_click_on_the_nth_article(int articleNumber) {
        homePage.clickOnNthArticle(articleNumber);
    }

    @When("I click on the {int} page number")
    public void i_click_on_the_next_page_number(int pageNumber) {
        homePage.clickOnNextPageNumber(pageNumber);
    }

    @Then("I should be redirected to the next page with articles")
    public void i_should_be_redirected_to_the_next_page_with_articles() {
        homePage.checkIfNextPageIsLoaded();
    }
}
