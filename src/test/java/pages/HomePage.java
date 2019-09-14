package pages;

import locators.HomePageObj;
import helper.SingletonDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomePage {

    ReadTestMap readTestMap = new ReadTestMap();

    String strTestData = null;
    WebDriver homePageDriver;

    public HomePage() {
        SingletonDriver singletonDriver = SingletonDriver.getSingletonDriver();
        this.homePageDriver = singletonDriver.getLocalDriver();
    }

    public boolean verifyHomePage(){

        boolean checkifPageisCorrect;

        WebDriverWait wait = new WebDriverWait(homePageDriver, 20);

        try{
            wait.until(ExpectedConditions.visibilityOf(homePageDriver.findElement(HomePageObj.fromSearchTextBox)));
            System.out.println("Go Ibibo Page is working as expected !!! ");
            checkifPageisCorrect = true;

        }catch (ElementNotVisibleException e){
            System.out.println("Element is not visible !!!");
            checkifPageisCorrect = false;
        }
        return checkifPageisCorrect;
    }

    public void searchFlight (String workbookName, String sheetName, String testcase, String origin, String destination) throws InterruptedException {

        /*
        clicking the from drop down menu
         */
        homePageDriver.findElement(HomePageObj.flightButton).click();
        Thread.sleep(4000);
        homePageDriver.findElement(HomePageObj.fromSearchPlaceHolder).click();
        strTestData = readTestMap.getTestDataFromTestMap(workbookName, sheetName, testcase, origin);
        homePageDriver.findElement(HomePageObj.fromSearchTextBox).sendKeys(strTestData);
        Thread.sleep(2000);
        homePageDriver.findElement(HomePageObj.fromDropDownMenu).click();
        Thread.sleep(2000);
        //homePageDriver.findElement(HomePageObj.toSearchTextBox).click();
        homePageDriver.findElement(HomePageObj.toSearchPlaceHolder).click();
        Thread.sleep(2000);
        strTestData = readTestMap.getTestDataFromTestMap(workbookName, sheetName, testcase, destination);
        homePageDriver.findElement(HomePageObj.toSearchTextBox).sendKeys(strTestData);
        Thread.sleep(2000);
        homePageDriver.findElement(HomePageObj.toDropDownMenu).click();

    }

    public void enterTravelDate () throws InterruptedException {

        homePageDriver.findElement(HomePageObj.fromDatePicker).click();
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) homePageDriver;
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", homePageDriver.findElement(By.xpath("//*[@class='datepicker-days']/table")));
        Thread.sleep(2000);

        homePageDriver.findElement(HomePageObj.fromDatePickerTextBox).clear();
        homePageDriver.findElement(HomePageObj.fromDatePickerTextBox).sendKeys(getCurrentDate().toString());

        Thread.sleep(2000);
        homePageDriver.findElement(HomePageObj.fromDatePickerTextBox).click();
        homePageDriver.findElement(HomePageObj.flightButton).click();

        Thread.sleep(2000);
        homePageDriver.findElement(HomePageObj.searchBtn).click();
    }

    public String getCurrentDate(){

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 4);
        Date newDate = calendar.getTime();
        String strDate= formatter.format(newDate);
        strDate = strDate.trim();
        System.out.println("New Date is --> " + strDate);
        return strDate;
    }
}
