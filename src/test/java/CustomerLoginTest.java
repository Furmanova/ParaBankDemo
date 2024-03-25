import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CustomerLogin;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CustomerLoginTest extends BasePageTest {
    CustomerLogin customerLogin;

    @BeforeEach
    public void setLoginPage() {
        customerLogin = page(CustomerLogin.class);
    }

    @Test
    public void testLoginPositive() {
        customerLogin.validFillForm();
        customerLogin.clickOnLoginBtn();
    }

    @Test
    public void testLoginNegative() {
        customerLogin.invalidFillForm();
        customerLogin.clickOnLoginBtn();
        customerLogin.setErrorMessage().shouldHave(text("The username and password could not be verified."));
    }
}
