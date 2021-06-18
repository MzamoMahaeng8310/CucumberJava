Feature: feature to test google search functionality

  @google
  Scenario: Validate google seach is working
    Given browser is open
    And user is on google seach page
    When use enters  text in the search box
    And hits enter
    Then user is navigated to search results

  @Seleniumeasy
  Scenario: Validate the selenium page
    Given : Browser is open
    And the user in the demo home  page
    When the user clicks on the start practicing link
    Then then the user is navigated to the BASIC EXAMPLES TO START WITH SELENIUM page
