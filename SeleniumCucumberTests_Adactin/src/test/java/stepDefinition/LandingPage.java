package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static pages.LandingPage.*;
import static pages.LoginPage.*;


public class LandingPage {

    @When("User should be able to view the Landing page")
    public void user_should_be_able_to_view_the_Landing_page() throws InterruptedException {
        validate_landing_page_header();
    }

    @Given("User has logged in the app as a Guest")
    public void user_has_logged_in_the_app_as_a_Guest(){
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("User books a room for a future date")
        public void user_books_a_room_for_a_future_date() throws InterruptedException {
        select_location();
        select_hotel();
        select_room_type();
        select_number_of_rooms();
        select_checkIn_date();
        select_checkOut_date();
        select_number_of_adults_per_room();
        select_number_of_children_per_room();
        click_submit();

    }

    @Then("User should should see matching booking details")
    public void user_should_should_see_matching_booking_details() throws InterruptedException {
        validate_HotelName();
        validate_Location_();
        validate_Rooms();
        validate_ArrivalDate();
        DepartureDate();
        NumberOfDays();
        RoomType();

    }

    @Then("User books for a room using a past date")
    public void user_books_for_a_room_using_a_past_date() throws InterruptedException {

        select_location();
        select_hotel();
        select_room_type();
        select_number_of_rooms();
        select_past_checkIn_date();
        select_checkOut_date();
        select_number_of_adults_per_room();
        select_number_of_children_per_room();
        click_submit();

    }


}
