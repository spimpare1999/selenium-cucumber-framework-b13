Feature: this is registration feature

  @Test01
  Scenario: Login with valid credentials 1
    Given I open application url in browser
    When I navigate to registration page
    And I fill registration form
    And I submit registration form
    Then Registration should be successful

    #RegisterSteps,RegisterActions,RegisterElements

  @Test04
  Scenario: Login with valid credentials 1
    Given I open application url in browser