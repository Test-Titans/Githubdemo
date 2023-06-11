package Cucumber;
import io.cucumber.java.en.*;

public class login {
    @Given("User open the application url")
    public void user_open_the_application_url() {
        System.out.println("User open the application url");

    }

    @And("Navigate to the login page")
    public void navigate_to_the_login_page() {
        System.out.println("User open the application url");

    }
    @When("user enter valid email address {string}")
    public void user_enter_valid_email_address(String email) {
        System.out.println("user enter valid email address" + email);

    }
    @And("enter valid password {string}")
    public void enter_valid_password(String password) {
        System.out.println("enter valid password" + password);

    }

    @Then("user should get login successfully")
    public void user_should_get_login_successfully() {
        System.out.println("user should get login successfully");

    }

    @Then("user should get proper warning message")
    public void user_should_get_proper_warning_message() {
        System.out.println("user should get proper warning message");

    }

    @And("User should not get login")
    public void user_should_not_get_login() {
        System.out.println("User should not get login");

    }
}
