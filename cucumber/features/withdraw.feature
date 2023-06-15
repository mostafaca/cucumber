@withdraw
Feature: Withdraw

  Scenario Outline: To verify the withdrawn function
    Given I have an bank account with <init> amount
    When I withdrawn the <withdrawn> amount from my account
    Then I will verify the <balance> in my account

    Examples: 
      | init | withdrawn | balance |
      | 1000 |       450 |     550 |
      |  200 |       160 |      40 |
