Feature: Search functionality

  @smoke @search
  Scenario: Search login
    Given I am on the login page
    When I enter username "admin" and password "password123"
    And I click login
    Then I should be logged in successfully

    @smoke @search
  Scenario: Search login1
    Given I am on the login page
    When I enter username "admin1" and password "password123"
    And I click login
    Then I should be logged in successfully
