package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FooterPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.RegisterPage;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestParent {

    WebDriver driver;
    MenuPage menu;
    LoginPage login;
    FooterPage footer;
    RegisterPage register;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.quit();
    }
}
