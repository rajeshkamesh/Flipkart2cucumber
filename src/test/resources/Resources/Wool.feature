#Author: your.email@your.domain.com


Feature: Wool

 	@wool
  Scenario: Title of your scenario
    Given login the flipkart
    When search mobile by using oneD list
    |redmi|realme|
    And select mobile
    And add to cart
    Then buy the mobile
    @wool
    Scenario Outline:
		Given login the flipkart
		When search mobile "<phone>"
		And select mobile
		And add to cart
		Then buy the mobile
		
		Examples:
		|phone|
 		|Realme|
 		|Redmi|
 	
