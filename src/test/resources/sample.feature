Feature: To validate the search functionality in RedBus application

Scenario: To login in instagram
Given To launch the browser and windows maximized
When To launch the Valid url
And  To find the locator of username field
And  To find the locator of password field
And  To click the login button
And  To check whether navigate to search page or not
Then To close entire browser

  
  
  Scenario Outline: to login in facebook
  Given user has launch browser and windows maximized
  When user has launch url of facebook application
  And  user has find the locator of username field
  And  user has find the locator of password field
  And user has click login button
  And  user has check whether the navigate to page or not
  Then close the entire browser
  
 
  
  
  
  Scenarios:
      | emaildata      |  password data      |
      |                |                     |
      |                |                     |
      |                |                     |
      |                |                     |