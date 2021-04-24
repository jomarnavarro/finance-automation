package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FooterPage extends BasePage {
    @FindBy(linkText = "IEX")
    WebElement iexLink;

    @FindBy(linkText = "IEX’s Terms of Use")
    WebElement iexTermsOfUseLink;

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public void validateElements() throws Exception {
        waitForElementsVisible(iexLink, iexTermsOfUseLink);
    }
}
