Feature: To test Specification functionality for Pricing selected as Basic

  Background: 
    Given User login to the retail application with URL
    """
    
    """
    When User enter the "xxxx" and "xxxxx"

  Scenario: To Pricing Method as Basic
    Given User login and navigate to Item Management module
    And User navigates to Specification module and click New Specification
    When User enter mandatory field details in Print Specification and click Next
      | Category | ProductType    | PrintMethod | Substrate     | Width | Height | Depth | Color | InlineFinishing | OfflineFinishing |
      | General  | Bin Strip Bath | Digitalsss  | 11.5 Blockout |   29 |    4128 |  10 | 3/0   | Laminate front. | Follow dieline.  |
    And User enter all mandatory fields in the Pricing and Multipiers and click Finish
      | SellPrice | UOM | Pieces | Multiple | ItemMultiplier |
      |        25 | Box |     22 |      132 | Exclude Stores    |
    Then User should successfully save see the message
    """
    Your specification has been updated.
    """
