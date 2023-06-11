package CucumberDemo;

import io.cucumber.java.en.*;

public class RegistrationDemo {
    @Given("^Navigate to test titans website$")
    public void navigate_to_test_titans_website() {
        System.out.println("User Navigated to test titans website");

    }
    @And("click on Create account section and enter all the mandatory fields")
    public void click_on_create_account_section_and_enter_all_the_mandatory_fields() {
        System.out.println("User clicked on create account button");

    }
    @When("user click on Register button")
    public void user_click_on_register_button() {
        System.out.println("User clicked on Registration button");

    }
    @Then("user should be able to register")
    public void user_should_be_able_to_register() {
        System.out.println("User should be able to register");

    }
}
