package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchSuggestions extends AbstractComponent {

    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestions(final WebDriver driver) {
        super(driver);
    }

    public void clickSuggestionByIndex(int index) {
        suggestions.get(index - 1).click();
    }

    @Override
    public boolean isDisplayed() {
        return wait.until(d -> suggestions.size() > 5);
    }
}
