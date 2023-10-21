Feature: HRM Automation

Scenario: Add Employee
   
    When enter the "Admin","admin123" in the given fields
    When click on Login
    Then verify the homepage display
    When click on PIM
    When click on Add Employee button
    Then enter "Sri","Tej" and click on Save
    Then click on Logout
    
    
    Scenario: Edit Employee
    
    When enter the "Admin","admin123" in the given fields
    When click on Login
    Then verify the homepage display
    When click on PIM
    When click on Employee List button
    Then enter "Sri" and click on Search
    And click on Edit
    Then enter the employee id and click on Save
    Then click on Logout
    
    
    Scenario: Delete Employee
   
    When enter the "Admin","admin123" in the given fields
    When click on Login
    Then verify the homepage display
    When click on PIM
    When click on Employee List button
    Then enter "Sri" and click on Search
    And click on Delete and click on Yes,Delete button
    Then click on Logout
    

