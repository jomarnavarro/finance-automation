package tests;

import org.testng.annotations.Test;

import java.util.Random;

public class RegisterTests extends TestParent {

    @Test
    public void adultUserRegistersSuccesfully() throws Exception {


        menu.clickRegisterLink();
        int randomNumber = new Random().nextInt(1000000);
        System.out.println("juan.perez" + randomNumber);
        register.registerUser("juan", "perez",
                "juan.perez"+randomNumber, "juan.perez@gmail.com",
                "Test@1234", "Test@1234",
                "8884561231", "12/12/1992",
                "4555555555555555", "12/26", "123");

        login.validateElements();

        login.logIn("juan.perez" + randomNumber, "Test@1234");
        home.validateElements();
        menu.validateLoggedInElements();
    }

//    Usuario menor de edad - Sergio

    @Test
    public void minorUserRegisterFailed() throws Exception {
        menu.clickRegisterLink();
        int randomNumber = new Random().nextInt(1000000);
        System.out.println("juan.perez" + randomNumber);
        register.registerUser("juan", "perez",
                "juan.perez"+randomNumber, "juan.perez@gmail.com",
                "Test@1234", "Test@1234",
                "8884561231", "12/12/2004",
                "4555555555555555", "12/26", "123");
        //error.validateRegistrationError("user can not be a minor");
        menu.clickLogIn();
        login.logIn("juan.perez" + randomNumber, "Test@1234");
        error.validateMessage("invalid username or password");
    }

//    Usuario con tarjeta invalida - Ricardo
    @Test
    public void UserInvalidCard( ) {

    }
//    Usuario confirma el codigo de verificacion - Marco
    @Test
    public void userConfirmVerificationCode(){

    }
//
//    Usuario no confirma codigo de verificacion - Sandra
    @Test
    public void userVerificationCodeNotConfirmed() {


    }
}
