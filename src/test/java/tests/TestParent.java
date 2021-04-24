package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestParent {

    WebDriver driver;
    MenuPage menu;
    LoginPage login;
    FooterPage footer;
    RegisterPage register;
    HomePage home;
    ErrorPage error;


    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost:5000/");
        login = new LoginPage(driver);
        home = new HomePage(driver);
        error = new ErrorPage(driver);
        menu = new MenuPage(driver);
        register = new RegisterPage(driver);
    }

    @After
    public void after() {
        driver.quit();
    }
}
