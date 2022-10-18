package com.stepdefinitions;

import com.pageobject.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseStepDefinition {
    private final HomePage homePage = new HomePage(driver);

    @When("I click on the {int} article")
    public void i_click_on_the_nth_article(int articleNumber) {
      homePage.clickOnNthArticle(articleNumber);
    }
}
