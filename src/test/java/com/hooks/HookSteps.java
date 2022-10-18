package com.hooks;

import static com.driver.Driver.closeDriver;
import static com.driver.Driver.initDriver;
import com.TestConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfig.class)
public class HookSteps {

    @Before
    public void beforeScenario() {
        initDriver();
    }

    @After
    public void afterScenario() {
        closeDriver();
    }
}
