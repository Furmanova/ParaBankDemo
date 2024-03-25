import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class BasePageTest {
    BasePageTest basePage;





    @BeforeEach
    public void goToPage() {
        basePage = (BasePageTest)open(Commons.BASE_URL, BasePageTest.class);
    }

    @AfterEach
    public void closeBrowser() {
        Configuration.holdBrowserOpen = true;
    }
}
