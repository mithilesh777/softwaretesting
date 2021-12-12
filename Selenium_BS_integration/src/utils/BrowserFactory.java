package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {


    public static final String USERNAME = "mithileshsingh_GZ6YFE";
    public static final String AUTOMATE_KEY = "AwD1m4PayoLgZYD3TspH";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver launchApplication(WebDriver driver, String browserName, String appUrl) throws MalformedURLException {
        if (browserName.equals("BS")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "chrome");
            caps.setCapability("browser_version", "92.0");
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Big Sur");
            caps.setCapability("build", "browserstack-build-1");
            caps.setCapability("name", "Thread 1");
            // caps.setCapability("browserstack.local", "true");
             driver = new RemoteWebDriver(new URL(URL), caps);
        }

        else if(browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./chromedriver 3");
            driver = new ChromeDriver();
        }
        driver.get(appUrl);
        return driver;
    }
}
