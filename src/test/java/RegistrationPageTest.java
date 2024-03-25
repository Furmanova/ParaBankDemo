import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.Registration;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationPageTest extends BasePageTest {
    Registration registerPage;

    @BeforeEach
    public void setRegisterPage() {
        registerPage = page(Registration.class);
    }

    @Test
    public void testRegistrationPage() {
        registerPage.clickButtonRegister();
        registerPage.validFillForm();
        registerPage.clickOnRegisterBtn();
    }
}
