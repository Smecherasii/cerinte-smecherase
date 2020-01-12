Feature: Login

  Scenario Outline: User successufully logs in
    Given the user is <user_type>
    And the user types in <user_name> into username field
    And the user types in <user_password> into password field
    And the credentials are correct
    When the user requests to login
    Then the user is successufully logged-in
    And a <token> is generated
    And a session should be created for the user
    And session should contain <token> and <user_name>
    And user should be redirected to <home_page>

    Examples:
      | user_type | user_name | user_password | token                                                                  | home_page    |
      | student   | Jimmy     | jimmyjimmy    | token1 | /app/student |
      | company   | Peter     | Peter123      | token2 | /app/company |
