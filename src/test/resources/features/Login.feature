Feature: This is to test the login functionality

  Scenario Outline: To test the customer login functionality
    Given User login to the retail application with URL
    """
    
    """
    When User enter the "<username>" and "<password>"
    Then User should login application successfully

    Examples: 
      | username     | password |
      | xxxxxxx | xxxxx |
