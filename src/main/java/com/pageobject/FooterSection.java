package com.pageobject;

import static com.data.Attribute.HREF;
import static com.util.WebElementAssertions.elementAttributeHasValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FooterSection extends BasePage {

    @FindBy(css = "#menu-item-29279 a")
    private WebElement disclaimerMenuItemLink;

    @FindBy(css = "#menu-item-29280 a")
    private WebElement advertiseMenuItemLink;

    @FindBy(css = "#menu-item-29281 a")
    private WebElement disclosureMenuItemLink;

    @FindBy(css = "#menu-item-29282 a")
    private WebElement privacyPolicyMenuItemLink;

    @FindBy(css = "#menu-item-29283 a")
    private WebElement contactMenuItemLink;

    @FindBy(css = "#menu-item-29284 a")
    private WebElement aboutMenuItemLink;

    @FindBy(css = ".cb-to-top a")
    private WebElement toTopArrowMenuItemLink;

    public void checkIfDisclaimerFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(disclaimerMenuItemLink, HREF, url);
    }

    public void checkIfAdvertiseFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(advertiseMenuItemLink, HREF, url);
    }

    public void checkIfDisclosureFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(disclosureMenuItemLink, HREF, url);
    }

    public void checkIfPrivacyPolicyFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(privacyPolicyMenuItemLink, HREF, url);
    }

    public void checkIfContactFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(contactMenuItemLink, HREF, url);
    }

    public void checkIfAboutFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(aboutMenuItemLink, HREF, url);
    }

    public void checkIfToTopArrowFooterMenuUrlPointToTheRightPage(String url) {
        elementAttributeHasValue(toTopArrowMenuItemLink, HREF, url);
    }

    public FooterSection(ChromeDriver driver) {
        super(driver);
    }
}
