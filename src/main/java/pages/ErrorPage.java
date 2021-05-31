package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorPage extends BasePage {

    @FindBy(css = "[src*='memegen']")
    WebElement errorImage;

    public ErrorPage(WebDriver driver) {super(driver); }

    public void validateMessage(String message) throws Exception {
        waitUntilVisible(errorImage);
        String currentErrorMessage = errorImage.getAttribute("src");
        String[] individualWords = message.split(" ");
        for(String word: individualWords) {
            if(currentErrorMessage.contains(word)) {
                System.out.println(word + " is included in the image.");
            } else {
                throw new Exception(word + " is not included in the image.");
            }
        }
    }


}
