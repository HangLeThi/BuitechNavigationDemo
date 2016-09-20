#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test Buitech website
  in order to verify that all links in website are work correctly

  # Scenario: verify the link on buitech website works correctly
  #  Given I am on http://buitech.co.uk/
  #  And maximize the browser
  #  When I click on testing services
  #  And the page is display with title page
  #  Then I close browser
  # Scenario: verify the link on buitech website works correctly
  #   Given I am on  http://buitech.co.uk/
  #   And maximize the browser
  #  When I click on testing solutions
  #  And the page is display with title page
  #  Then I close browser
  Scenario Outline: verify the link on buitech website works correctly
    Given I am on  http://buitech.co.uk/
    And maximize the browser
    When I click on "<Link>"
    And the page is display with "<title page>"
    Then I close browser

    Examples: 
      | Link           | Title Page        |
      | testing-services  | Testing Services  |
      | testing-solutions | Testing Solutions |
      | resources         | Resources         |
      | clients           | Clients           |
      | /                 | buitech.co.uk |   |
      | news              | News              |
