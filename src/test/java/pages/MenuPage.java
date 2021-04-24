package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    @FindBy(css="[href='/']")
    WebElement imagenLogo; //

    @FindBy(linkText="Register")
    WebElement linkRegistro; //

    @FindBy(linkText = "Log In")
    WebElement linkLogin;

    @FindBy(linkText = "Quote")
    WebElement quoteLink;

    @FindBy(linkText = "Buy")
    WebElement buyLink;

    @FindBy(linkText = "Sell")
    WebElement sellLink;

    @FindBy(linkText = "History")
    WebElement historyLink;

    @FindBy(linkText = "Log Out")
    WebElement logoutLink;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterLink() {
        linkRegistro.click();
    }

    public void clickLogIn() throws Exception {
        waitUntilVisible(linkLogin);
        linkLogin.click();
    }

    public void validateLoggedInElements() throws Exception {

        waitForElementsVisible(quoteLink, buyLink, sellLink, historyLink, logoutLink);
    }
}
