Feature: verify the fakestoreapi functionality
  Scenario: To verify the functionality of get method
    Given I hit the url of the product in the get
    When its show the response
    Then validate the reponse code
