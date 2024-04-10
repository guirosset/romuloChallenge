@login
Feature: WebJumpTest

    Background:
        Given User access page

    @login-CT001 @smoke @regression
    Scenario: Makes buttons to disappear
        When user clicks on button one
        Then user clicks on button two
        And user clicks on button three


#    @qualquercoisa
#    Scenario Outline: CTE001 - Login exception
#        When I fill in the login form with the data email "<email>" and password "<password>"
#        Then the error message "<errorMessage>" should appear in the page
#        Examples:
#            | email   | password | errorMessage               |
#            |         |          | Invalid email or password. |