@update-task
Feature: Update Branch

  Background:
    Given user create new task from quick task "Update Task"
    When user update task from quick task "Update Task"

  Scenario Outline: Add new task from quick task and update task name,list and date
    When user clear text
    When user input text task "<name>"
    And user input date task "<date>"
    And user input time task
    And user choose repeat task "<repeat_task>"
    And user choose add list task "<list_task>"
    And user save task
    Then user should see detail information "<name>"
    Then user should see detail information "<date_information>"
    Then user should see detail information "<list_task>"
    Examples:
      | list_task | repeat_task | date      | date_information | name                           |
      | Personal  | Once a Day  | today     | Today            | Software Development in Test 1 |
      | Shopping  | Once a Day  | tomorrow  | Tomorrow         | Software Development in Test 2 |
      | Wishlist  | Once a Day  | yesterday | Overdue          | Software Development in Test 3 |
