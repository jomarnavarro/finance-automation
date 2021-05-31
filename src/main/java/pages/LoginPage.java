package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(name="username")
    WebElement nameTxt;

    @FindBy(name="password")
    WebElement passwordTxt;

    @FindBy(className = "btn")
    WebElement buttonLogin;

    public LoginPage(WebDriver driver) { super(driver);}

    public void logIn(String usuario, String password) {
        wait.until(ExpectedConditions.visibilityOf(nameTxt));
        nameTxt.sendKeys(usuario);
        passwordTxt.sendKeys(password);
        buttonLogin.click();
    }

    public void validateElements() throws Exception {
        waitForElementsVisible(nameTxt, passwordTxt, buttonLogin);
    }


}
