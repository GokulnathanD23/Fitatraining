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

Feature: 
letsshop web Application Automation
Background:
     Given lets shop url is loaded
     When user enters the email
    When user enters the password
    When user clicks on login button
    Then check navigates to homepage
    When user click on "zara"product to Add
    When user click on cart
    
  @smoke 
  Scenario: userlogin with credentials
   Then check naviagtes to homepage
   When user adds fashion product
   When user click on carts
   And close the browser
   
   @Regression @test
   Scenario: user Adding Electronic Product
   Then check naviagtes to homepage
   When user adds Electronic Product
   When user click on carts
   And close the browser
   
   
   Scenario Outline: user adding mutliple products
    Given lets shop url is loaded
     When user enters the email
    When user enters the password
    When user clicks on login button
    Then check navigates to homepage
    When user click on "<Products>"product to add
    When user click on cart
    
    Examples:
    |Products|
    |ZARA|
    |ADIDAS|
    |IPHONE|
    
   
    