package helper;

import org.openqa.selenium.WebDriver;

/*
Created By Shivank
This class is used for providing a common driver instance throughout the framework
 */
public class SingletonDriver {

    private static SingletonDriver singletonDriver = new SingletonDriver();

    private SingletonDriver(){ }

    public static SingletonDriver getSingletonDriver () { return  singletonDriver; }

    WebDriver commonDriver;

    public WebDriver getLocalDriver() {
        return commonDriver;
    }

    public void setLocalDriver(WebDriver driver) {
        this.commonDriver = driver;
    }
}
