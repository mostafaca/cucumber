package steps;

import org.junit.Assert;

import Bank.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class DepositSteps {     // step defination or Glue file. 
	
	Bank bank;
	
	
	@Given("I have an account with {int} amount")
	public void i_have_an_account_with_amount(Integer init) {
	    
	  bank= new Bank (init);      
	}

	@When("I deposit {int} amount in my account")
	public void i_deposit_amount_in_my_account(Integer some) {
	
	 bank.deposit(some);
	}

	@Then("I verify the {int} in my account")
	public void i_verify_the_in_my_account(Integer balance) {
	  
	  int expected=balance;
	  
	  int actual= bank.getBalance();
	  
	  Assert.assertEquals(expected, actual);  // here the import will be from import junit.framework.Assert; but we need to use update version : import org.junit.Assert;
	}


}
