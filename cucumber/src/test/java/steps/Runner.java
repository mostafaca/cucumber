package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)     // 1st import Cucumber, 2nd RunWith, 3rd CucumberOptions import. 
@CucumberOptions(
		
		features="features",    // here, left features is the key the right features is the value(the name of the folder). 
		
		glue=  "steps",         // here, steps is the name of the package . 	
		
		plugin= {"pretty",      // here under pretty plugin the report can be generated into 2 options (json or html) under the target folder. 
				
				
				 "json:target/report/json/output.json",   // we dont need json now 
				
				"html:target/report/html/index.html"},   	// we will see report as html. 
		
		tags= ("@deposit"))   //  tags means , which feature we want to run, here in deposit.feature we used @deposit. 
							  //  so we will use this @deposit. One feature can hold lot of scenarios, and if we run a feature, all the scenarios will run.   

public class Runner {

}
