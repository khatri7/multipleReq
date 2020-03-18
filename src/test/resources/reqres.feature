Feature: performing different requests on reqres API

  Scenario: Verify total records on a get request
    Given the baseURI is set as "https://reqres.in/api/"
    And the paramater "page" is set as "2"
    When a GET request is made on "users"
    Then verify response status code is 200
    And the "total" is 12
