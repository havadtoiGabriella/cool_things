package com.pageobject;

import static com.util.WebElementHandler.clickOn;
import static com.util.WebElementHandler.getTextFrom;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".cb-post-title a")
    private List<WebElement> articles;

    @FindBy(css = ".cb-img-fw")
    private List<WebElement> images;

    public void clickOnNthArticle(int articleNumber) {
        articleTitle = getTextFrom(articles.get(articleNumber), driver);
        clickOn(images.get(articleNumber), driver);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
