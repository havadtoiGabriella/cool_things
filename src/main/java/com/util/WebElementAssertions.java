package com.util;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import com.data.Attribute;
import com.logger.Logger;
import org.openqa.selenium.WebElement;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementIsDisplayed(WebElement element) {
        LOGGER.debug("Checking if element is displayed");
        assertThat(element.isDisplayed()).isTrue();
    }

    public static void elementAttributeHasValue(WebElement element, Attribute attribute, String expectedValue) {
        LOGGER.debug("Validating if the element " + attribute + " attribute is " + expectedValue);
        assertThat(element.getAttribute(attribute.getAttributeName())).isEqualTo(expectedValue);
    }

    public static void elementHasText(WebElement element, String expectedText) {
        LOGGER.debug("Validating if the element has the text " + expectedText);
        assertThat(element.getText()).isEqualToIgnoringCase(expectedText);
    }

    public static void listDoesNotContainText(List<WebElement> elements, String text) {
        LOGGER.debug("Validating if list has the element.");
        assertThat(elements.contains(text)).isFalse();
    }
}
