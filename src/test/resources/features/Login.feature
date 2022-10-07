Feature: this is login feature

  @Test01
  Scenario: Login with valid credentials 1
    Given I open application url in browser
    And I navigate to login page
    When Enter I enter 'test@test.com', 'test123' and click on login
    Then Login should be successful