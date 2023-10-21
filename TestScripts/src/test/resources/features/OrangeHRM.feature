Feature: OrangeHRM application Automation

  Scenario: Login
    
    When enter the userName,passWord in the given fields
    When click on Login
    Then verify the homepage display
    Then click on Logout
    

  Scenario: Parameters
    
    When enter the "Admin","admin123" in the given fields
    When click on Login
    Then verify the homepage display
    Then click on Logout
   

  Scenario Outline: Datadriven Testing
    
    When enter the "<userName>","<passWord>" in the given fields
    When click on Login
    Then verify the homepage display
    Then click on Logout
    

    Examples: 
      | userName | passWord |
      | Admin    | admin123 |
      | Admin    | admin123 |