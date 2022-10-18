package com.stepdefinitions;

import static com.driver.Driver.getChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStepDefinition {
    ChromeDriver driver = getChromeDriver();
    protected final String BASE_URL = "https://www.coolthings.com/";
}
