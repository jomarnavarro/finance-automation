package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestParent {

    WebDriver driver;
    MenuPage menu;
    LoginPage login;
    FooterPage footer;
    RegisterPage register;
    HomePage home;
    ErrorPage error;


    @BeforeMethod
    public void before() throws MalformedURLException {
        //BROWSER can be either chrome or firefox
        //HUB_HOST is on the localhost, or somewhere on the network (with an IP or a hostname)

        String host = "localhost";
        String appUrl = "http://finance:5000";
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        if(System.getProperty("APP_URL") != null) {
            appUrl = System.getProperty("APP_URL");
        }
        if(System.getProperty("BROWSER") != null
            && System.getProperty("BROWSER").equalsIgnoreCase(BrowserType.FIREFOX)) {
            dc = DesiredCapabilities.firefox();
        }

        if(System.getProperty("HUB_HOST") != null) {
            host = System.getProperty("HUB_HOST");
        }

        String selGridUrl = "http://" + host + ":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(selGridUrl), dc);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(appUrl);
        login = new LoginPage(driver);
        home = new HomePage(driver);
        error = new ErrorPage(driver);
        menu = new MenuPage(driver);
        register = new RegisterPage(driver);
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
