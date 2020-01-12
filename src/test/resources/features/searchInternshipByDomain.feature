Feature: Search internship by domain

  Scenario Outline: user has a student account
    Given the domain is <domain>
    And the user types in <domain>
    When the user clicks on search button
    Then the application should display a table with <filtered_domains>

    Examples:
      | domain  | filtered_domains             |
      | IT      | [Java,PHP,C#]                |
      | Vanzari | [Profi,Carrefour,Mega Image] |
