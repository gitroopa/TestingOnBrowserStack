package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    public static String USERNAME = "USerName";
    public static String AUTOMATE_KEY = "Key";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    static WebDriver driver;

    public static WebDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            return createDriverInstance();
        }
        return driver;
    }

    public static WebDriver createDriverInstance() throws MalformedURLException {

        USERNAME = System.getProperty("USERNAME");
        AUTOMATE_KEY = System.getProperty("AUTOMATE_KEY");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "latest");

        driver = new RemoteWebDriver(new URL(URL),caps);
        return driver;
    }
}
