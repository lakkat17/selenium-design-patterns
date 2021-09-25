package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestions searchSuggestions;

    public GoogleMainPage(final WebDriver driver) {
        this.driver = driver;
        searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        searchSuggestions = PageFactory.initElements(driver, SearchSuggestions.class);
    }

    public void goTo(){
        driver.get("https://www.google.com/");
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestions getSearchSuggestions() {
        return searchSuggestions;
    }
}
