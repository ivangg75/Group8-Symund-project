@B34G8-207

Feature: Default


		Scenario: User creates a new list of tasks
		    Given the user is logged into the Symund webpage.
		    When the user navigates to the "Tasks" section
		    And the user navigate by clicking on "Add List"
		    And the user enters a name for the new task list
		    Then the new task list is created	



		Scenario: User can create a new task
		    Given the user is on the "NewTaskList" webpage we created.
		    When the user navigates to the "Ass a task to "NewTaskList" " section .
		    And the user navigate by clicking on the "Ass a task to "NewTaskList" " placeholder section.
		    And the user enters a name for the new task list --> "TaskTest" and enter.
		    Then the new task in the previous task list is created.	

	

		Scenario: User can add any task to the list of completed tasks by clicking on the checkbox near the
		task name
		    Given the user is on the "NewTaskList" webpage we created.
		    When the user navigates to the "TaskTest" tab section .
		    And the user navigate by clicking on the "Checkbox"on the left side of the tab section.
		    Then the task is under "Completed Task" list.	



		Scenario: User can add any task to the list of important tasks by clicking on the star icon on the
		right side of the task line
		    Given the user is on the "NewTaskList" webpage we created.
		    When the user navigates to the "TaskTest" tab section .
		    And the user navigate by clicking on the "Star" icon on the right side of the tab section.
		    Then the task is added to "Important" section.	

	

		Scenario: User can see the number of all uncompleted tasks next to the Current tab
		    Given the user is on the "NewTaskList" webpage we created.
		    When the user navigates to the "Current" tab section by clicking on it.
		    Then the tasks we created are listed in the page.