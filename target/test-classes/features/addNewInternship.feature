Feature: Add a new internship session

  Scenario Outline: Internship successufully added
    Given the user is company representant for <company>
    And the user is on add-new-internship-page
    And the user types in an <internship_name>
    And the user types in an <period>
    And the user types in an <technology>
    And the user types in an <salary>
    When the user submits the form
    Then the user should be redirected to internship_page
    And the user should see a confirmation pop-up
    And the internship's company should be <company>

    Examples:
      | internship_name        | period  | technology | salary | company  |
      | Java Internship        | 6 weeks | Java       | 1500$  | Google   |
      | Internship at Wallmart | 4 weeks | Vanzari    | 500$   | Wallmart |
