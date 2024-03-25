
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import pages.IconContact;

import static com.codeborne.selenide.Selenide.page;

public class IconContactTest extends BasePageTest {
    IconContact iconContact;

    @BeforeEach
    public void setContactPage() {
        iconContact = page(IconContact.class);
    }

    @Test
    public void testContactForm() {
        iconContact.clickIconButtonContact();
        iconContact.fillContactForm();
        iconContact.clickButtonSend();
        iconContact.verificationMessage().shouldHave(text("A Customer Care Representative will be contacting you."));
    }
    }

