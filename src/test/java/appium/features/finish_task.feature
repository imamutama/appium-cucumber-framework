@finish-task
Feature: New Task

  Background:
    Given user create new task from quick task "Update Task"

  @task-finished
  Scenario: User finished task from home page
    When user click button check box
    Then user should see detail information "Task Finished"