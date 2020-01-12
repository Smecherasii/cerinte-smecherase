Feature: Submit an application

  Scenario Outline: User successufully submits an application to <internship>
    Given the user is student
    And the student is on specific page for submitting an application to <internship>
    And the student fills in a textarea with <additional_info>
    And the student attach a <cv_name>
    And cv is in format <cv_format>
    When the user requests to submits his applications
    Then the user should see a confirmation pop-up
    And the user should be redirected to

    Examples:
      | internship          | additional_info                          | cv_name           | cv_format |
      | Java Internship     | I really want to be part of your team    | Joedoe.pdf        | pdf       |
      | Wallmart internship | I would like to have a flexible schedule | philipcollins.doc | doc       |