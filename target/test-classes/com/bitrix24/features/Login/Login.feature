Feature: Login as different people using maps


  Scenario Outline: Login as different credentials
    Given I login using these credentials "<username>" "<password>"

    Then the page title should be "<title>"

    Examples:
      | username                       | password | title      |
      | helpdesk11@cybertekschool.com  | UserUser | (2) Portal |
      | marketing11@cybertekschool.com | UserUser | Portal     |