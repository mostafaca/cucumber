package steps;



import org.junit.Assert;

import Bank.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import junit.framework.Assert;

public class Deposit_Withdraw {
	
	Bank bankdw;
	
	@Given("I have {int} amount in my bank")
	public void i_have_amount_in_my_bank(Integer primary) {
	    
		bankdw= new Bank(primary);
		
	}

	@When("I deposited {int} amount in my account yesterday")
	public void i_deposited_amount_in_my_account_yesterday(Integer some1) {
	   
      bankdw.deposit(some1);
		
	}


		
	@When("I want to check the current {int}  balance in my account")
	public void i_want_to_check_the_current_balance_in_my_account(Integer balance1) {
	    
     int expected= balance1;
     int actual=bankdw.getBalance();
     
     Assert.assertEquals(expected, actual);
		
	}

	@Then("I withdrawn the {int} amount from my account today")
	public void i_withdrawn_the_amount_from_my_account_today(Integer withdrawn1) {
	   
	bankdw.withdraw(withdrawn1);
		
	}

	@Then("I need to re-check the {int} in my account")
	public void i_need_to_re_check_the_in_my_account(Integer newbalance) {
	   
    int expected= newbalance;
    
    int actual=bankdw.getBalance();
    
    Assert.assertEquals(expected, actual);
		
	}
	
	
	

}
