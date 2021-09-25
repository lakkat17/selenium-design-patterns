package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStat extends AbstractComponent {

    public ResultStat(final WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#result-stats")
    private WebElement resultStat;

    public String getResultStat() {
        return resultStat.getText();
    }

    @Override
    public boolean isDisplayed() {
        return wait.until(d -> resultStat.isDisplayed());
    }
}
