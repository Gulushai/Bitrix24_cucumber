Feature:
  As a user I should be able to create a task from activity stream
  1. Verify that user can create new task by clicking on task on activity
  2. Verify the user can upload a file and image or link or add checklist regarding to new task
  3. Verify that user should be able to set up a deadline for new task

  @wip
  Scenario: Create a task from Activity Stream
    Given User logs in using "marketing"
    When User navigates to "Activity Stream" module
    Then User selects "Task" tag
    And User gives the name of the task in the Things To Do section
    And User writes description of the task
    Then User uploads a file
    And User should be able to set up a deadline
    Then User sends new created task




