package com.learn.seleniumdesignpattern.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private SearchWidget searchWidget;
    private SearchSuggestions searchSuggestions;
    private NavigationBar navigationBar;
    private ResultStat resultStat;

    public GoogleResultPage(final WebDriver driver) {
        searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        searchSuggestions = PageFactory.initElements(driver, SearchSuggestions.class);
        navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        resultStat = PageFactory.initElements(driver, ResultStat.class);
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestions getSearchSuggestions() {
        return searchSuggestions;
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public ResultStat getResultStat() {
        return resultStat;
    }
}
