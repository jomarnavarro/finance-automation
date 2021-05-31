package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests extends TestParent {

    @Test(dataProvider = "correctLogin", dataProviderClass = params.LoginParams.class)
    public void loginCorrecto(String username, String password) throws Exception {
        login.logIn(username, password);
        home.validateElements();
        menu.validateLoggedInElements();
    }

    @Test(dataProvider = "incorrectLogin", dataProviderClass = params.LoginParams.class)
    public void loginIncorrecto(String username, String password) throws Exception {
        login.logIn(username, password);
        error.validateMessage("invalid username or password");
        System.out.println(driver.getCurrentUrl());

    }

    @Test(dataProvider = "emptyPasswordLogin", dataProviderClass = params.LoginParams.class)
    public void loginSinPassword(String username, String emptyPassword) throws Exception {
        login.logIn(username, emptyPassword);
        error.validateMessage("must provide password");
        System.out.println(driver.getCurrentUrl());
    }

}
