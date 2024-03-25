package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AboutUs {
    public static final By aboutUs = By.xpath("//body/div[@id='mainPanel']/div[@id='headerPanel']/ul[1]/li[2]/a[1]");

    public AboutUs() {
    }

    public void clickButtonAboutAs()
    {$(aboutUs).shouldBe(new Condition[]{Condition.enabled}).click();
    }
}
