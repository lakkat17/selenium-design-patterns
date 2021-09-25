package com.learn.seleniumdesignpattern.srp.test.srp.stepDefs;

import com.learn.seleniumdesignpattern.srp.GoogleMainPage;
import com.learn.seleniumdesignpattern.srp.GoogleResultPage;
import com.learn.seleniumdesignpattern.srp.test.srp.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

public class GoogleTestSteps {

    WebDriver driver;
    TestContext context;
    GoogleMainPage googleMainPage;
    GoogleResultPage googleResultPage;

    public GoogleTestSteps(TestContext context) {
        this.context = context;
        driver = this.context.getWebDriverManager().getDriver();
    }

    @Given("^^setup google pages$")
    public void setupPages() {
        googleMainPage = new GoogleMainPage(driver);
        googleResultPage = new GoogleResultPage(driver);
    }

    @When("^user go to google main page$")
    public void googleWorkflow() {
        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
    }

    @Then("^user search for (.+)$")
    public void searchString(String s) {
        googleMainPage.getSearchWidget().searchText(s);
    }

    @And("^user select (\\d)+ index$")
    public void selectSuggestionByIndex(int index) {
        googleResultPage.getSearchSuggestions().isDisplayed();
        googleResultPage.getSearchSuggestions().clickSuggestionByIndex(index);
    }

    @And("^user navigates to news section$")
    public void newsSection() {
        googleResultPage.getNavigationBar().isDisplayed();
        googleResultPage.getNavigationBar().gotoNews();
    }

    @Then("^user gets result string$")
    public void getResult() {
        googleResultPage.getResultStat().isDisplayed();
        String result = googleResultPage.getResultStat().getResultStat();
        System.out.println(result);
    }
}
