Feature: Test API threw Karate Framework
  Scenario: create and retrive a cat
    Given url 'http://jsonplaceholder.typicode.com/users'

    When method get

    Then status 200