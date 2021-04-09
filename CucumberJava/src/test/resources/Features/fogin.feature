#this is used for comments
#Cucumber course date: 03 Saturday 2021
@SmokeFeature
Feature: feature to test login functinality

@smoketest
  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
