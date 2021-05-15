package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class QuotePage extends BasePage {

    //elementos de la pagina
    @FindBy(css="[name='symbol']")
    WebElement symbolField;

    @FindBy(css = "ul#symbol_options")
    WebElement stockOtionsList;

    @FindBy(css = "li[symbol_option]")
    List<WebElement > stockOptionsElement;

    @FindBy(css = "[symbol]")
    List<WebElement > symbolElement;

    @FindBy(css = "[company-name]")
    List<WebElement > companyElement;

    @FindBy(css = ".btn")
    WebElement quoteBtn;

    public QuotePage(WebDriver driver) {
        super(driver);
    }

    //metodos pasos o verificaciones

    public void inputPartialSymbol(String symbolPart) {
        symbolField.sendKeys(symbolPart);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul#symbol_options")));
    }

    public void selectSymbolFromList(String symbol) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[Symbol='"+symbol+"']")
        )).click();
    }

    public void clickQuoteButton() {
        quoteBtn.click();
    }
}
