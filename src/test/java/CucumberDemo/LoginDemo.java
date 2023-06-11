package CucumberDemo;

import io.cucumber.java.en.*;

public class LoginDemo {

    @And("user enters the incorrect login id {string}")
    public void user_enters_the_incorrect_login_id(String email) {
        System.out.println("Users enter the correct email"+ email);
    }
    @And("user enters the incorrect password {string}")
    public void user_enters_the_incorrect_password(String pass) {
        System.out.println("Users enter the correct password"+ pass);

    }
    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        System.out.println("Users able to login with valid credential");

    }
    @And("users type something {string}")
    public void users_type_something(String pass1) {
        System.out.println("Typed something"+pass1);

    }

    @Given("^user enters the correct login id (.+)$")
    public void user_enters_the_correct_login_id(String email) {
        System.out.println("Users enter the correct email"+ email);
    }
    @Given("^user enters the correct password (.+)$")
    public void user_enters_the_correct_password(String pass) {
        System.out.println("Users enter the correct password"+ pass);
    }
    @When("^user click on login button$")
    public void user_click_on_login_button() {
        System.out.println("Users clicked on login button");
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        System.out.println("Users able to login with valid credential");
    }
}
