package locators;

import org.openqa.selenium.By;

public class PaxDetailsObj {

    public static By guestBookingButton = By.xpath("//*[@class='mb15']/div[2]/div[2]/a");
    public static By firstNameTextBox =  By.xpath("//*[@name='ticketBookingForm/div/div/div/div/section/div[2]/div/input']");  //By.id("name");
    public static By lastNameTextBox = By.id("surname");
}
