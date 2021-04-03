package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTests extends TestParent {

    @Test
    public void adultUserRegistersSuccesfully() {
        //abrir la url
        driver.get("");
        //dar click en registro
        driver.findElement(By.cssSelector("")).click();
        //llenar los campos
        //dar click en registrar
        //validar que sale un mensaje de confirmacion
        //validar que estamos en la pagina de login
        //hacer el login en la pagina
    }

//    Usuario menor de edad - Sergio

    @Test
    public void minorUserRegisterFailed() {

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
