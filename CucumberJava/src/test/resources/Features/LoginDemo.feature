Feature: Test login fuontionality

  @LoginDemo
  Scenario Outline: Check login is succesful wih valid credentials
    Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And user clicks on login
    Then navigate the user to the home page

    #adding the data table
    Examples: 
      | username   | password |
      | ShadabKhan |    12345 |
    #  | Johny        |    12345 |
    #  | Rupaul       |    12345 |
    #  | SergioAguero |    12345 |
