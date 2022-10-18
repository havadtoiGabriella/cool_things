package com.util;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import com.logger.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WebElementHandler {
    private static final Logger LOGGER = new Logger(WebElementHandler.class);
    private static final long DEFAULT_TIMEOUT = 10;
    private static final long WAIT_TIMEOUT = 5;

    private WebElementHandler() {
    }

    public static void clickOn(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Clicking on the element.");
//        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
//        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(elementToBeClickable(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        element.click();
    }

    public static void waitForElementToBeVisible(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Waiting for the element to be visible.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(visibilityOf(element));
    }

    public static String getTextFrom(WebElement element, ChromeDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(visibilityOf(element));
        return element.getText();
    }
}
