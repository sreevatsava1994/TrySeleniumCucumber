Feature: Login functionality

  @smoke
  Scenario: Valid login
    Given I am on the login page
    When I enter username "admin" and password "password123"
    And I click login
    Then I should be logged in successfully
