import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ForgotLogin;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Condition.text;

public class ForgotLoginTest extends BasePageTest {
    ForgotLogin forgotLogin;

    @BeforeEach
    public void setForgotLoginPage() {
        forgotLogin = page(ForgotLogin.class);
    }

    @Test
    public void testForgotLoginInfo() {
        forgotLogin.clickButtonForgotLogin();
        forgotLogin.validFillLookupForm();
        forgotLogin.setMessage().shouldHave(text("Your login information was located successfully. You are now logged in."));
    }
}
