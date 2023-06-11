package CucumberDemo.cucumb;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class exp {
    @Given("Pick the dialer")
    public void Pick_the_dialer()
    {
        System.out.println("Dialer picked the call");
    }
    @And("enters the valid number {int}")
    public void  enters_the_valid_number(int num){
        System.out.println("Number dialled"+num);
    }
    @Then("User should get connected")
    public void User_should_get_connected()
    {
       System.out.println("User connected");
    }
}
