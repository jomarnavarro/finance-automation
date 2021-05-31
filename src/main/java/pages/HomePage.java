package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//th[text() = 'Symbol']")
    WebElement symbolLabel;

    @FindBy(xpath = "//th[text() = 'Name']")
    WebElement nameLabel;

    @FindBy(xpath= "//td[text() = 'CASH']")
    WebElement cashLabel;

    public HomePage(WebDriver driver) {super(driver);
    }

    public void validateElements() throws Exception {
        waitForElementsVisible(symbolLabel, nameLabel, cashLabel);
    }
}
