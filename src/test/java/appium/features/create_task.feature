@create-task
Feature: New Task

  Background:
    Given user click add create task

  @create-new-task
  Scenario Outline: User create new task for "<date>"
    When user input text task "Test Super Apps 2023"
    And user input date task "<date>"
    And user input time task
    And user choose repeat task "<repeat_task>"
    And user choose add list task "<list_task>"
    And user save task
    Then user should see detail information "Test Super Apps 2023"
    Then user should see detail information "<list_task>"
    Then user should see detail information "<date_information>"
    Examples:
      | list_task | repeat_task  | date      | date_information |
      | Personal  | Once a Day   | today     | Today            |
      | Shopping  | Once a Month | tomorrow  | Tomorrow         |
      | Wishlist  | Once a Week  | yesterday | Overdue          |

  @create-with-new-list
  Scenario Outline: User create new task with new list
    When user input text task "Test Super Apps 2023"
    And user input date task "<date>"
    And user input time task
    And user choose repeat task "<repeat_task>"
    And user add new list task "<list_task>"
    And user save task
    Then user should see detail information "Test Super Apps 2023"
    Then user should see detail information "<list_task>"
    Then user should see detail information "<date_information>"
    Examples:
      | list_task | repeat_task | date  | date_information |
      | SDET      | Once a Day  | today | Today            |
