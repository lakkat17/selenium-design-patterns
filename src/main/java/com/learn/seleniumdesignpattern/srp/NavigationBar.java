package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {

    public NavigationBar(final WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#hdtb")
    private WebElement navigationBar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;

    public void gotoImages() {
        images.click();
    }

    public void gotoNews() {
        news.click();
    }

    @Override
    public boolean isDisplayed() {
        return wait.until(d -> navigationBar.isDisplayed());
    }
}
