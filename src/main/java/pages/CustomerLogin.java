package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import until.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;

public class CustomerLogin {
    static final String validUsername = PropertiesLoader.loadProperty("valid.username");
    static final String validPassword = PropertiesLoader.loadProperty("valid.password");
    static final String invalidUserName = PropertiesLoader.loadProperty("invalid.username");
    static final String invalidPassword = PropertiesLoader.loadProperty("invalid.password");
    By USER_NAME = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]");
    By PASSWORD = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]");
    By LOGIN_BUTTON = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
    By ERROR_MESSAGE = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");

    public CustomerLogin() {
    }

    public CustomerLogin validFillForm() {
        $(this.USER_NAME).setValue(validUsername);
        $(this.PASSWORD).setValue(validPassword);
        return (CustomerLogin)Selenide.page(CustomerLogin.class);
    }

    public void invalidFillForm() {
        $(this.USER_NAME).setValue(invalidUserName);
        $(this.PASSWORD).setValue(invalidPassword);
    }

    public void clickOnLoginBtn() {
        $(this.LOGIN_BUTTON).click();
    }

    public SelenideElement setErrorMessage() {
        return $(this.ERROR_MESSAGE);
    }
}
