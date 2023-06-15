@deposit
Feature: Deposit

  Scenario Outline: To verify the deposit function
    Given I have an account with <init> amount
    When I deposit <some> amount in my account
    Then I verify the <balance> in my account

    Examples: 
      | init | some | balance |
      | 1000 |  500 |    1500 |
      |  200 |  200 |     400 |
