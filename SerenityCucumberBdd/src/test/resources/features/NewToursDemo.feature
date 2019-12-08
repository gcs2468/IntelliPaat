Feature: This is test feature

  @Smoke
  Scenario: scenario one
    Given I am at home page of the application
    And I enter demo and demo as credentials
    When I click on Login button
    Then I should see SignOff link
    And I click on Logout button
    Then I should see SignOn link

  @Regression
  Scenario Outline: scenario two
    Given I am at home page of the application
    And I enter <username> and <password> as credentials
    When I click on Login button
    Then I should see SignOff link2
    And I click on Logout button
    Then I should see SignOn link

    Examples:
      | username | password |
      | demo     | demo     |
      #| demo     | demo     |
