Feature: Google Site

  Scenario: Open start page
    Given I open start page
    ##When My Login button is visible
    ##Then I can click that button
    And I type search keyword "Hello World"
    When I hit Enter
    Then I verify the Search results page is opened