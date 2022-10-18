package com.pageobject;

import static com.util.WebElementAssertions.elementHasText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage {
    @FindBy(css = "h1.cb-title")
    private WebElement title;

    public void checkIfCorrectPageIsLoaded() {
        elementHasText(title, articleTitle);
    }

    public ArticlePage(ChromeDriver driver) {
        super(driver);
    }
}
