package com.runner;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("com")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com")
public class Runner {
}
