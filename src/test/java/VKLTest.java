/*Created by Stanislav Silkov */

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.Vkl;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("ВКЛ")
public class VKLTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void first() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Order(1)
    @Test
    @DisplayName("Ввод логина и пароля")
    public void enterLoginAndSmsCode(){
        Vkl Vkl = new Vkl(driver);
        Vkl.enterLoginAndSmsCode();
    }

    @Order(2)
    @Test
    @DisplayName("Ввод смс-кода")
    public void enterPassword() throws InterruptedException {
        Vkl Vkl = new Vkl(driver);
        Vkl.enterPassword();
    }

}
