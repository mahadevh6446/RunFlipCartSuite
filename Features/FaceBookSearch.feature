Feature: Searching Iphone mobile below 40000

Scenario: Successfull Login with valid credentials

Given User should launch the broweser
When User opens the URL "https://www.flipkart.com/"
And Click on Close button the login popup
And Click on Search box in home page and Enter the "Iphone"
Then Click on the Search button
When apply the filters
Then Get the Mobile name and Price
Then Store in in CSV file
And Close the broser