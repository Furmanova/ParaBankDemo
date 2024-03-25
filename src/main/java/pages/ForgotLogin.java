package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ForgotLogin {
    public static final By firstName = By.id("firstName");
    public static final By lastName = By.id("lastName");
    public static final By address = By.id("address.street");
    public static final By city = By.id("address.city");
    public static final By state = By.id("address.state");
    public static final By zipCode = By.id("address.zipCode");
    public static final By sSN = By.id("ssn");
    public static final By buttonFindMyLoginInfo = By.xpath("//tbody/tr[8]/td[2]/input[1]");
    public static final By clickButtonForgotLoginInfo = By.xpath("//a[contains(text(),'Forgot login info?')]");
    public static final By setMessage = By.xpath("//p[contains(text(),'Your login information was located successfully. Y')]");

    public ForgotLogin() {
    }

    public void validFillLookupForm() {
        $(firstName).setValue("Ivan").pressEnter();
        $(lastName).setValue("Ivanov").pressEnter();
        $(address).setValue("Berlin").pressEnter();
        $(city).setValue("Berlin").pressEnter();
        $(state).setValue("German").pressEnter();
        $(zipCode).setValue("123").pressEnter();
        $(sSN).setValue("2344").pressEnter();
    }

    public void clickButtonFindMyLoginInfo() {
        $(buttonFindMyLoginInfo).click();
    }

    public void clickButtonForgotLogin() {
        $(clickButtonForgotLoginInfo).click();
    }

    public SelenideElement setMessage() {
        return $(setMessage);
    }
}
