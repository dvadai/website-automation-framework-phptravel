Feature: Blog information
  As a user
  I would like to read blogposts from the company
  So that I can be informed about latest travel trends and travel relevant information

  Scenario Outline: Usr is able to search for blogpost
    Given I am on the blogs page
    And I search for information <type>in the blog
    When I submit my search request
    Then the relevant blogs will be displayed on the page
  Examples:
  |type|
  |title|
  |content|
