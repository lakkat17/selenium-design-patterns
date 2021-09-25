package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractComponent {

    protected WebDriverWait wait;

    public AbstractComponent(final WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    protected abstract boolean isDisplayed();
}
