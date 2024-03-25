package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IconContact {
    public static final By name = By.xpath("//input[@id='name']");
    public static final By email = By.xpath("//input[@id='email']");
    public static final By phone = By.xpath("//input[@id='phone']");
    public static final By message = By.xpath("//textarea[@id='message']");
    public static final By buttonSend = By.xpath("//tbody/tr[5]/td[2]/input[1]");
    public static final By iconButtonContact = By.xpath("//a[contains(text(),'contact')]");
    public static final By checkingMessage = By.xpath("//p[contains(text(),'A Customer Care Representative will be contacting ')]");

    public IconContact() {
    }

    public void fillContactForm() {
        $(name).setValue("Ivan").pressEnter();
        $(email).setValue("furmanovolga!gmail.com").click();
        $(phone).setValue("+49123333222").click();
        $(message).setValue("Hello, mein name is Ivan, I have problem");
    }

    public void clickButtonSend() {
        $(buttonSend).click();
    }

    public void clickIconButtonContact() {
        $(iconButtonContact).click();
    }

    public SelenideElement verificationMessage() {
        return $(checkingMessage);
    }
}