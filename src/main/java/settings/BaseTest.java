package settings;

/*Created by Stanislav Silkov */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {


    static WebDriver driver = new ChromeDriver();
    @AfterAll
    @DisplayName("Закрытие браузера")
    public static void close() {
        driver.close();
    }
}