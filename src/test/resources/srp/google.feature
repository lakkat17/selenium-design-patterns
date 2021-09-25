Feature: This is to construct a small single responsibility principle design pattern

  Background:
    Given setup google pages

  Scenario: search in google to check SRP principle
    Given user go to google main page
    When user search for selenium
    And user select 3 index
    And user navigates to news section
    Then user gets result string