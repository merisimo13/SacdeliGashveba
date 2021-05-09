import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class DesignHotel {
    @Test
    public void designsHotel() {


        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;


        Configuration.baseUrl = "https://www.designhotels.com";
        Selenide.open("/travel-professionals/register/");


    }

}