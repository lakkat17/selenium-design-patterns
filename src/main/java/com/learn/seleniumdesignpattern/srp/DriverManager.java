package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* keeping it
 simple */
public class DriverManager {
    WebDriver driver;

    public WebDriver createDriver() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        return new FirefoxDriver();
    }

    public WebDriver getDriver() {
        if (driver == null)
            driver = createDriver();
        return driver;
    }
}
