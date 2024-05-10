Feature:
  Checking users first name

  Scenario: Verify the users name.
    Given I get the user 2
    When I get users First Name
    Then I verify users First Name