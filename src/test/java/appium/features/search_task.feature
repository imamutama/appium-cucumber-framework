@search-task
Feature: Search Task

  @search-success
  Scenario: Search task by name success
    Given user create new task from quick task "Search Task"
    When user click search
    And user input search task "Search Task"
    Then user should see detail information "Search Task"

  @search-invalid
  Scenario: Search task by name invalid
    When user clear text search
    And user input search task "Test Invalid"


