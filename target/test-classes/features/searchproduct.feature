Feature: Search and place the order for vegetable

Scenario: User should have same search experience for product search in home page and offers page
Given User is on Greenkart landing page
When User searched with shortname "Tom" and extract actual name of product
Then User go and search for "Tom" short name in offers page to check if offer exists
And User validates product name on landing page with offers page

