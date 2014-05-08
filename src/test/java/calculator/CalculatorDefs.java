package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorDefs {

    private Calculator calculator = null;
    private Integer result = null;

    @Given("a calculator")
    public void a_calculator() {
        calculator = new Calculator();
    }

    @When("^i sum the number (\\d+) and (\\d+)$")
    public void i_sum_the_number_and(int arg1, int arg2) throws Throwable {
        result = calculator.sum(arg1, arg2);
    }

    @Then("^the result is ([\\-\\d]+)$")
    public void the_result_is(int arg1) throws Throwable {
        assertEquals(arg1, result.intValue());
    }

    @When("^i multiply the number ([\\-\\d]+) and ([\\-\\d]+)$")
    public void i_multiply_the_number_and(int arg1, int arg2) throws Throwable {
        result = calculator.multiply(arg1, arg2);
    }

}
