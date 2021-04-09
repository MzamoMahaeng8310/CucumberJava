Feature: feature to test google search functionality

@google
  Scenario: Validate google seach is working
    Given Browser is open
    And user is on google seach page
    When use enters  text in the search box
    And hits enter
    Then user is navigated to search results
@supersport
  Scenario: Validate the supersport page
    Given : Browser is open
    And the user in the superport page
    When the user clicks on the rugby link
    Then then the user is navigated to the rugby page
