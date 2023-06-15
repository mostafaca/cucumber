package steps;

import org.junit.Assert;

import Bank.Bank_withdraw;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class withdrawSteps {
	
	Bank_withdraw bankW;

	
	@Given("I have an bank account with {int} amount")
	public void i_have_an_bank_account_with_amount(Integer init) {
	    
		bankW= new Bank_withdraw(init);
		
	}

	@When("I withdrawn the {int} amount from my account")
	public void i_withdrawn_the_amount_from_my_account(Integer withdrawn) {
		
	    
		bankW.withdraw(withdrawn);
	}

	@Then("I will verify the {int} in my account")
	public void i_will_verify_the_in_my_account(Integer balance) {
	    
		
		int expected= balance;
		
		int actual=bankW.getBalance();
		
		Assert.assertEquals(expected, actual);

	}

	
}

