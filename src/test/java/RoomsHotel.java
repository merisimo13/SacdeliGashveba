import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RoomsHotel {
    @Test
    public void hotel() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;


        Selenide.open("https://roomshotels.com/");
        $(byText("Welcome to Georgia")).waitUntil(Condition.visible, 3000);
        $(".cta__text").click();
        String expetedResult = "Old City. New City.".toUpperCase();
        Assert.assertEquals("check title",expetedResult,$("h1").getText());
        $(".menu-toggler__icon").click();
        $(byText("Events Calendar")).click();
        $(".ui-selectmenu-text").click();
        $("#ui-id-2").click();
        Assert.assertEquals("check text","All",$("#type-button").getText());
        $(byName("from")).click();
        $(".ui-datepicker-next").click();
        $(byLinkText("13")).click();
        Assert.assertEquals("check date", "13/06/21",$("#from").getValue());


        sleep(5000);



        }
    }
