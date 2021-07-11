Feature: Place an order from wishlist

  Scenario: As a customer, I want to select minimum priced product from my wishlist and add to cart.
     Given I add four different product to my wish list
     When I view my wishlist table
     Then I find total four selected items in my wishlist
     When I search for lowest price product
     And I am able to add the lowest price item to my cart
     Then I am able to verify the item in my cart

