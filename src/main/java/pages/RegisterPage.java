package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(name="first_name")
    WebElement firstName;

    @FindBy(name="last_name")
    WebElement lastName;

    @FindBy(name="username")
    WebElement userName;

    @FindBy(name="email")
    WebElement email;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="repeat_password")
    WebElement textBoxRepeatPassword; //
    @FindBy(name="phone")
    WebElement textBoxPhone; //
    @FindBy(name="birthdate")
    WebElement textBoxBirthDate; //
    @FindBy(name="cc")
    WebElement textBoxCreditCard; //
    @FindBy(name="expiration")
    WebElement textBoxExpDateCC; //
    @FindBy(name="cvv")
    WebElement textBoxCvvCC; //
    @FindBy(id="register_btn")
    WebElement buttonRegister;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser(String firstNameVal, String lastNameVal,
                             String userNameVal, String emailVal,
                             String passwordVal, String repeatPassVal,
                             String phoneVal, String birthDateVal,
                             String ccNumberVal, String ccExpVal, String cvvVal) {
        firstName.sendKeys(firstNameVal);
        lastName.sendKeys(lastNameVal);
        userName.sendKeys(userNameVal);
        email.sendKeys(emailVal);
        password.sendKeys(passwordVal);
        textBoxRepeatPassword.sendKeys(repeatPassVal);
        textBoxPhone.sendKeys(phoneVal);
        textBoxBirthDate.sendKeys(birthDateVal);
        textBoxCreditCard.sendKeys(ccNumberVal);
        textBoxExpDateCC.sendKeys(ccExpVal);
        textBoxCvvCC.sendKeys(cvvVal);


        buttonRegister.click();

    }


}
