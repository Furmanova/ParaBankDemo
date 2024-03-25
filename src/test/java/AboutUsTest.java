import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AboutUs;

import static com.codeborne.selenide.Selenide.page;

public class AboutUsTest extends BasePageTest {
    AboutUs aboutUs;

    @BeforeEach
    public void setAboutPage() {
        this.aboutUs = page(AboutUs.class);
    }

    @Test
    public void testAboutUs() {
        aboutUs.clickButtonAboutAs();
    }
}
