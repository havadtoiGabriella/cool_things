package com.stepdefinitions;

import com.pageobject.ArticlePage;
import io.cucumber.java.en.Then;

public class ArticlePageStep extends BaseStepDefinition {
    private final ArticlePage articlePage = new ArticlePage(driver);

    @Then("I should be redirected to the article's landing page")
    public void i_should_be_redirected_to_the_articles_landing_page() {
        articlePage.checkIfCorrectPageIsLoaded();
    }
}
