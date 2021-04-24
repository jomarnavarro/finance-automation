package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends TestParent {

    @Test
    public void loginCorrecto() throws Exception {
        login.logIn("sergio", "Test@1234");
        home.validateElements();
        menu.validateLoggedInElements();
    }

    @Test
    public void loginIncorrecto() throws Exception {
        login.logIn("sergio", "nose123");
        error.validateMessage("invalid username or password");

    }

    @Test
    public void loginSinPassword() throws Exception {
        login.logIn("sergio", "");
        error.validateMessage("must provide password");
    }

}
