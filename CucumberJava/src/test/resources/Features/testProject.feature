Feature: Test Project Example  Page

  @TestProjectExamplePage
  Scenario Outline: Complete the test form
    Given The user is on the TestProject Example Page
    And the TestProject Page is verified
    When The <country> downdown value is selected
    And The <address> is entered
    And Enter the <email> address
    And The user enters the <phoneNumber> 
    And the Save button is clicked
    Then the entry is saved

    Examples: 
      #adding the input variable table
      | country  | address            | email               | phoneNumber |
      | Cameroon | koos avenue durban | koos.piet.gmail.com |  0958668757 |
