package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public void waitUntilVisible(WebElement elem) throws Exception {
        try {
            wait.until(ExpectedConditions.visibilityOf(elem));
        } catch(TimeoutException te) {
            System.out.println("The element does not exist");
            throw new Exception("The Element does not exist");
        }

    }

    public void waitForElementsVisible(WebElement ... elements) throws Exception {
        for(WebElement elem: elements) {
            waitUntilVisible(elem);
        }

    }
}
