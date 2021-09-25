package com.learn.seleniumdesignpattern.srp.test.srp.stepDefs;

import com.learn.seleniumdesignpattern.srp.test.srp.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.internal.com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    private TestContext testContext;

    public BaseTest(TestContext context) {
        this.driver = context.getWebDriverManager().getDriver();
    }

    @Before
    public void setUp() {
        // nothing here
    }

    @After
    public void tearDown() {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        if (driver != null)
            driver.quit();
    }
}
