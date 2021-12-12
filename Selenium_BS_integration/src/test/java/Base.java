package test.java;

import org.testng.annotations.*;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static final String USERNAME = "mithileshsingh_GZ6YFE";
    public static final String AUTOMATE_KEY = "AwD1m4PayoLgZYD3TspH";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public WebDriver iDriver;
    public WebDriver driver;
    public Properties pro;
    public static LoginPage loginPage;

    @BeforeSuite
    public void setUpSuite() throws IOException {
    //ToDo
    }

    @Parameters({"browser_name"})
    @BeforeClass(alwaysRun = true)
    public void setUp(String browser_name) throws IOException {
        File source = new File("./Config.properties");
        FileInputStream fis = new FileInputStream(source);
        pro = new Properties();
        pro.load(fis);
        driver= BrowserFactory.launchApplication(iDriver,browser_name,pro.getProperty("url"));
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void closeBrowsersSessions() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
