package com.learn.seleniumdesignpattern.srp.test.srp;

import com.learn.seleniumdesignpattern.srp.DriverManager;

public class TestContext {

    private DriverManager driverManager;

    public TestContext() {
        driverManager = new DriverManager();
    }

    public DriverManager getWebDriverManager() {
        return driverManager;
    }
}
