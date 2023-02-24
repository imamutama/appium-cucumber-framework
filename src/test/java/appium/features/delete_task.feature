@delete-task
Feature: Delete Task

  Background:
    Given user create new task from quick task "Delete Task"

  Scenario:
    When user click on by "Delete Task" text
    When user click button delete
    Then user should see detail information "Task Deleted"

