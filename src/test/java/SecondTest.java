import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SecondTest {
    @Test
    public void secondTest(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://redmed.ge/ka");
        $(".text-nowrap",2).click();
        $(".login-link-main-page").click();
        $(".col-lg-4").$(By.tagName("h1")).shouldHave(Condition.text("შესვლა"));
        //$("#telLogin").setValue("59283616");
        //$("#login-button").shouldBe(Condition.disabled);
        $("#telLogin").setValue("592836161");
        $("#login-button").shouldBe(Condition.enabled);
        $("#login-button").click();
        $(byText("მონაცემები არასწორია")).shouldBe(Condition.visible);

        sleep (5000);
    }
}
