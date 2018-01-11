/**
 * 
 */
package com.king.step;

import org.hamcrest.core.Is;
import org.junit.Assert;

import com.king.myThread.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Administrator
 *
 */
public class AddTest {
    Calculator calculator;
    @Given("^i input (\\d+)  and (\\d+)$")
    public void i_input_and(int arg1, int arg2) throws Throwable {
       calculator=new  Calculator();
       calculator.setNum1(Integer.valueOf(arg1));
       calculator.setNum2(Integer.valueOf(arg2));
    }

    @When("^the calculator is run$")
    public void the_calculator_is_run() throws Throwable {
       calculator.calculate();
    }

    @Then("^the put should be  (\\d+)totle$")
    public void the_put_should_be_totle(int totle) throws Throwable {
    	Assert.assertThat(calculator.getTotle(), Is.is(Integer.valueOf(totle)));
    }
}
