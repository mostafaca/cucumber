@deposit_withdraw
Feature: Deposit_Withdraw

  Scenario Outline: To verify the deposit and withdraw function
    Given I have <primary> amount in my bank
    When I deposited <some1> amount in my account yesterday
    And I want to check the current <balance1>  balance in my account
    Then I withdrawn the <withdrawn1> amount from my account today
    And I need to re-check the <newbalance> in my account

    #Examples: 
      #| primary | some1 | withdrawn1 | newbalance |
      #|    1000 |   500 |        450 |       1050 |
      #|     200 |   200 |        160 |        240 |
      
      
       Examples: 
      | primary | some1 | balance1 | withdrawn1 | newbalance |
      |    1000 |   500 |     1500 |        450 |       1050 |
      |     200 |   200 |      400 |        160 |        240 |
