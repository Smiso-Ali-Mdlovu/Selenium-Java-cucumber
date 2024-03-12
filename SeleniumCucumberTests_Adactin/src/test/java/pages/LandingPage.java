package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LandingPage extends BrowserDriver {

    public static String landingPage_header_xpath = "/html/body/table[2]/tbody/tr[1]/td[1]";
    public static String location_xpath = "//*[@id=\"location\"]";
    public static String hotels_xpath = "//*[@id=\"hotels\"]";
    public static String room_type_xpath = "//*[@id=\"room_type\"]";
    public static String room_nos_xpath = "//*[@id=\"room_nos\"]";
    public static String datepick_in_xpath = "//*[@id=\"datepick_in\"]";
    public static String datepick_out_xpath = "//*[@id=\"datepick_out\"]";
    public static String adult_room_xpath = "//*[@id=\"adult_room\"]";
    public static String child_room_xpath = "//*[@id=\"child_room\"]";
    public static String Submit_xpath = "//*[@id=\"Submit\"]";


    //Displayed Results

    public static String HotelName_xpath = "//*[@id=\"hotel_name_0\"]";

    public static String Location_xpath = "//*[@id=\"location_0\"]";

    public static String Rooms_xpath = "//*[@id=\"rooms_0\"]";

    public static String ArrivalDate_xpath = "//*[@id=\"arr_date_0\"]";

    public static String DepartureDate_xpath = "//*[@id=\"dep_date_0\"]";

    public static String NumberOfDays_xpath = "//*[@id=\"no_days_0\"]";

    public static String RoomType_xpath = "//*[@id=\"room_type_0\"]";





    public static void validate_landing_page_header() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(landingPage_header_xpath));
    }

    public static void select_location(){

        Select Select = new Select(driver.findElement(By.xpath(location_xpath)));
        Select.selectByValue("Sydney");

    }

    public static void select_hotel(){
        Select Select = new Select(driver.findElement(By.xpath(hotels_xpath)));
        Select.selectByValue("Hotel Creek");
    }

    public static void select_room_type(){
        Select Select = new Select(driver.findElement(By.xpath(room_type_xpath)));
        Select.selectByValue("Standard");
    }

    public static void select_number_of_rooms(){
        Select Select = new Select(driver.findElement(By.xpath(room_nos_xpath)));
        Select.selectByIndex(1);
    }


    public static void select_past_checkIn_date(){

        String past_date = "08/04/2024";

        driver.findElement(By.xpath(datepick_in_xpath)).sendKeys(past_date);

        String result = validateCheckInDate(past_date);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Check-In Date is valid.");
        }

    }

    public static void select_checkIn_date(){
        driver.findElement(By.xpath(datepick_in_xpath)).sendKeys("16/04/2024");

    }

    public static void select_checkOut_date(){
        driver.findElement(By.xpath(datepick_out_xpath)).sendKeys("20/04/2024");

    }

    public static void select_number_of_adults_per_room(){
        Select Select = new Select(driver.findElement(By.xpath(adult_room_xpath)));
        Select.selectByIndex(1);
    }

    public static void select_number_of_children_per_room(){
        Select Select = new Select(driver.findElement(By.xpath(child_room_xpath)));
        Select.selectByIndex(1);
    }

    public static void click_submit() throws InterruptedException {

        driver.findElement(By.xpath(Submit_xpath)).click();

    }

    //Displayed Booking Details
    public static void validate_HotelName() throws InterruptedException {
        driver.findElement(By.xpath(HotelName_xpath));
    }

    public static void validate_Location_() throws InterruptedException {
        driver.findElement(By.xpath(Location_xpath));
    }
    public static void validate_Rooms() throws InterruptedException {
        driver.findElement(By.xpath(Rooms_xpath));
    }
    public static void validate_ArrivalDate() throws InterruptedException {
        driver.findElement(By.xpath(ArrivalDate_xpath));
    }
    public static void DepartureDate() throws InterruptedException {
        driver.findElement(By.xpath(DepartureDate_xpath));
    }

    public static void NumberOfDays() throws InterruptedException {
        driver.findElement(By.xpath(DepartureDate_xpath));
    }

    public static void RoomType() throws InterruptedException {
        driver.findElement(By.xpath(RoomType_xpath));
    }

    public static String validateCheckInDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date checkInDate = sdf.parse(dateString);
            Date currentDate = new Date(); // Current date

            // If check-in date is before current date
            if (checkInDate.before(currentDate)) {
                 System.out.println("Check-In Date shall be before than Check-Out Date.");;
            }
        } catch (ParseException e) {
            // Handle parse exception if input date format is incorrect
            e.printStackTrace();
        }
        return null; // Return null if check-in date is not in the past
    }









}
