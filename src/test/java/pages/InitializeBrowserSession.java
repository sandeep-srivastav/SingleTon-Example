package pages;

import helper.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InitializeBrowserSession {

    WebDriver homePageDriver;

    public InitializeBrowserSession() {

        SingletonDriver singletonDriver = SingletonDriver.getSingletonDriver();
        this.homePageDriver = singletonDriver.getLocalDriver();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/BrowserDriver/Mac//chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("windoow-size=1400,600");
        //chromeOptions.addArguments("headless");

        homePageDriver = new ChromeDriver(chromeOptions);
        singletonDriver.setLocalDriver(homePageDriver);
    }


    public void openWebPage(String url) {
        homePageDriver.navigate().to(url);
    }
}
