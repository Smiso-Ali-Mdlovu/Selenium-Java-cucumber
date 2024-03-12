package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static pages.LoginPage.*;

public class loginPage {

    @When("User Enters Correct details to login")
    public void user_enters_correct_details_to_login(){
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

}
