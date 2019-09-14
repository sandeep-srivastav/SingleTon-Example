package locators;

import org.openqa.selenium.By;

public class HomePageObj {

    public static By flightButton = By.xpath("//*[@title='Flights']");

    public static By fromSearchPlaceHolder = By.xpath("//*[@id='thflights']/div[1]");
    public static By fromSearchTextBox =By.xpath("//*[@id='origin']");
    public static By fromDropDownMenu = By.xpath("//*[@class='select2-result-label']/span");

    public static By toSearchPlaceHolder = By.xpath("//*[@id='thflights']/div[2]");
    public static By toSearchTextBox = By.xpath("//*[@id='destination']");
    public static By toDropDownMenu = By.xpath("//*[@class='select2-result-label']/span");

    public static By fromDatePicker = By.xpath("//*[@id='thflights']/div[3]");
    public static By fromDatePickerTextBox = By.xpath("//*[@id='departure']");

    public static By searchBtn = By.xpath("//*[@id='thflights']/div[6]");
}
