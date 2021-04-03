package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

    @FindBy(css="[href='/']")
    WebElement imagenLogo; //

    @FindBy(linkText="Register")
    WebElement linkRegistro; //

    @FindBy(linkText = "Log In")
    WebElement linkLogin;


}
