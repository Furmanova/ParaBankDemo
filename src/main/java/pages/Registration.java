package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Registration {
    public static final By firstName = By.id("customer.firstName");
    public static final By lastName = By.id("customer.lastName");
    public static final By address = By.id("customer.address.street");
    public static final By city = By.id("customer.address.city");
    public static final By state = By.id("customer.address.state");
    public static final By zipCode = By.id("customer.address.zipCode");
    public static final By phone = By.id("customer.phoneNumber");
    public static final By sSN = By.id("customer.ssn");
    public static final By username = By.id("customer.username");
    public static final By password = By.id("customer.password");
    public static final By confirm = By.id("repeatedPassword");
    public static final By buttonRegister = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    public static final By getButtonRegister = By.cssSelector("div:nth-child(3) div:nth-child(1) div:nth-child(2) p:nth-child(3) > a:nth-child(1)");

    public Registration() {
    }

    public void validFillForm() {
        $(firstName).setValue("Ivan").pressEnter();
        $(lastName).setValue("Ivanov").pressEnter();
        $(address).setValue("Berlin").pressEnter();
        $(city).setValue("Berlin").pressEnter();
        $(state).setValue("German").pressEnter();
        $(zipCode).setValue("123").pressEnter();
        $(phone).setValue("+481223343").pressEnter();
        $(sSN).setValue("2344").pressEnter();
        $(username).setValue("ivan").pressEnter();
        $(password).setValue("Milistan83!").click();
        $(confirm).setValue("Milistan83!").click();
    }

    public void clickOnRegisterBtn() {
        $(buttonRegister).click();
    }

    public void clickButtonRegister() {
        $(getButtonRegister).click();
    }
}
